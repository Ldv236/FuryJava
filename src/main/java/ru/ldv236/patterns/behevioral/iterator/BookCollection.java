package ru.ldv236.patterns.behevioral.iterator;

// Коллекция книг
class BookCollection {
    private Book[] books;
    private int index = 0;

    // Создаем коллекцию фиксированного размера
    public BookCollection(int size) {
        books = new Book[size];
    }

    // Добавляем книгу в коллекцию
    public void addBook(Book book) {
        if (index < books.length) {
            books[index] = book;
            index++;
        }
    }

    // Возвращаем итератор для обхода книг
    public BookIterator iterator() {
        return new BookIterator(this);
    }

    // Возвращаем массив книг
    public Book[] getBooks() {
        return books;
    }
}