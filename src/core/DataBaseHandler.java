package core;

import entity.BookEntity;
import org.sqlite.JDBC;

import java.sql.*;
import java.util.*;

public class DataBaseHandler {
    // Константа, в которой хранится адрес подключения
    private static final String CON_STR = "jdbc:sqlite:./book.db";

    // Используем шаблон одиночка, чтобы не плодить множество
    // экземпляров класса DbHandler
    private static DataBaseHandler instance = null;

    public static synchronized DataBaseHandler getInstance() throws SQLException {
        if (instance == null)
            instance = new DataBaseHandler();
        return instance;
    }

    // Объект, в котором будет храниться соединение с БД
    private Connection connection;

    private DataBaseHandler() throws SQLException {
        // Регистрируем драйвер, с которым будем работать
        // в нашем случае Sqlite
        DriverManager.registerDriver(new JDBC());
        // Выполняем подключение к базе данных
        this.connection = DriverManager.getConnection(CON_STR);
    }

    private void dropTable() {
        try (Statement statement = this.connection.createStatement()) {
            statement.execute("DROP TABLE IF EXISTS books");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTable() throws SQLException {
        try (Statement statement = this.connection.createStatement()) {
            statement.execute("CREATE TABLE books\n" +
                    "(\n" +
                    "    id     INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                    "    title  TEXT    NOT NULL,\n" +
                    "    author TEXT    NOT NULL,\n" +
                    "    year   INTEGER NOT NULL\n" +
                    ");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setUp() throws SQLException {
        this.dropTable();
        this.createTable();
    }

    public void addBook(BookEntity book) {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "INSERT INTO books(`title`, `author`, `year`) " +
                        "VALUES(?, ?, ?)")) {
            statement.setObject(1, book.title);
            statement.setObject(2, book.author);
            statement.setObject(3, book.year);
            // Выполняем запрос
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int bookId) {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "DELETE FROM books WHERE id = ?")) {
            statement.setObject(1, bookId);
            // Выполняем запрос
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<BookEntity> getAllBooks() {
        List<BookEntity> books = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
            while (resultSet.next()) {
                BookEntity book = new BookEntity(
                        resultSet.getInt("id"),
                        resultSet.getString("title"),
                        resultSet.getString("author"),
                        resultSet.getInt("year")
                );
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public void updateBook(BookEntity book) {
        try (PreparedStatement statement = this.connection.prepareStatement(
                "UPDATE books SET title = ?, author = ?, year = ? WHERE id = ?")) {
            statement.setObject(1, book.title);
            statement.setObject(2, book.author);
            statement.setObject(3, book.year);
            statement.setObject(4, book.id);
            // Выполняем запрос
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
