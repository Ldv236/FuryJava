package ru.lessons24.Diplom.Model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int id;
    private String name;
    private final List<Book> books;
    private int borrowCount;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
        this.borrowCount = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
        book.setAvailable(false);
        borrowCount++;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void removeBook(Book book) {
        books.remove(book);
        book.setAvailable(true);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "{" + id + ", " + name + '}';
    }
}
