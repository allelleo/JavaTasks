import core.DataBaseHandler;
import entity.BookEntity;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void printAllBooks(DataBaseHandler handler) {
        List<BookEntity> books = handler.getAllBooks();
        if (books.isEmpty()) {
            System.out.println("Список книг пуст.");
        } else {
            for (BookEntity book : books) {
                System.out.println(book);
            }
        }
    }
    public static void userAddBook(DataBaseHandler handler) {
        Scanner scanner = new Scanner(System.in);  // Предполагается, что scanner создаётся здесь
        System.out.println("Введите название книги");
        String name = scanner.nextLine();
        System.out.println("Введите автора книги");
        String author = scanner.nextLine();
        System.out.println("Введите год издания");
        int year = scanner.nextInt();
        scanner.nextLine();  // Очистка буфера после ввода int

        // Создание экземпляра книги
        BookEntity book = new BookEntity(name, author, year);

        // Добавление книги в базу данных
        handler.addBook(book);
    }

    public static void userDeleteBook(DataBaseHandler handler) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID книги для удаления");
        int id = scanner.nextInt();
        scanner.nextLine();  // Очистка буфера после ввода int

        // Удаление книги из базы данных
        handler.deleteBook(id);
        System.out.println("Книга с ID " + id + " удалена.");
    }

    // Функция для обновления данных книги
    public static void userUpdateBook(DataBaseHandler handler) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID книги для обновления");
        int id = scanner.nextInt();
        scanner.nextLine();  // Очистка буфера после ввода int

        System.out.println("Введите новое название книги");
        String name = scanner.nextLine();
        System.out.println("Введите нового автора книги");
        String author = scanner.nextLine();
        System.out.println("Введите новый год издания");
        int year = scanner.nextInt();
        scanner.nextLine();  // Очистка буфера после ввода int

        // Создание экземпляра книги с новыми данными
        BookEntity updatedBook = new BookEntity(id, name, author, year);

        // Обновление книги в базе данных
        handler.updateBook(updatedBook);
        System.out.println("Данные книги с ID " + id + " обновлены.");
    }

    public static void userActionsText(){
        System.out.println("1. Показать все книги");
        System.out.println("2. Добавить книгу");
        System.out.println("3. Удалить книгу");
        System.out.println("4. Обновить книгу");
        System.out.println("5. Вывести действия");
        System.out.println("6. Выйти");
    }
    public static void main(String[] args) {
        try {
            // Создаем экземпляр по работе с БД
            DataBaseHandler dbHandler = DataBaseHandler.getInstance();
            dbHandler.setUp();

            // Инициализация сканнера для чтения пользовательского ввода
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            // Показать доступные действия в начале
            userActionsText();

            // Основной цикл для пользовательского ввода
            while (!exit) {
                System.out.println("Введите номер действия:");
                int action = scanner.nextInt();
                scanner.nextLine();  // Очистка буфера после ввода числа

                switch (action) {
                    case 1:
                        printAllBooks(dbHandler);
                        break;
                    case 2:
                        userAddBook(dbHandler);
                        break;
                    case 3:
                        userDeleteBook(dbHandler);
                        break;
                    case 4:
                        userUpdateBook(dbHandler);
                        break;
                    case 5:
                        userActionsText();
                        break;
                    case 6:
                        System.out.println("Выход из программы.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Неверный выбор, попробуйте снова.");
                        break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}