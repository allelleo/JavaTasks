package entity;

public class BookEntity {
    // Поля класса
    public int id;

    public String title;

    public String author;

    public int year;

    // Конструктор
    public BookEntity(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public BookEntity(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Выводим информацию по продукту
    @Override
    public String toString() {
        return String.format("ID: %s | Название: %s | Автор: %s | Год: %s",
                this.id, this.title, this.author, this.year);
    }
}
