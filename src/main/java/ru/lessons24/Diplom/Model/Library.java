package ru.lessons24.Diplom.Model;

import ru.lessons24.Diplom.Exception.BookNotFoundException;
import ru.lessons24.Diplom.Exception.UserNotFoundException;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Library {
    private final Map<Integer, Book> books = new HashMap<>();
    private final Map<Integer, User> users = new HashMap<>();

    // Добавление книги в библиотеку
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    // Добавление пользователя в библиотеку
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    // Выдача книги пользователю
    public void borrowBook(int userId, int bookId)
            throws BookNotFoundException, UserNotFoundException {
        User user = users.get(userId);
        if (user == null) {
            throw new UserNotFoundException(userId);
        }
        Book book = books.get(bookId);
        if (book == null) {
            throw new BookNotFoundException(bookId);
        }
        if (!book.isAvailable()) {
            System.out.println(book + " - находится на руках");
            return;
        }
        user.addBook(book);
        System.out.println(user + " - выдана книга " + book);
    }


    // Возврат книги пользователем
    public void returnBook(int userId, int bookId) {
        User user = users.get(userId);
        if (user == null) {
            throw new UserNotFoundException(userId);
        }
        Book book = books.get(bookId);
        if (book == null) {
            throw new BookNotFoundException(bookId);
        }
        if (!user.getBooks().contains(book)) {
            System.out.println(user + " - нет книги " + book);
            return;
        }
        user.removeBook(book);
        System.out.println(user + " - вернул " + book);
    }

    public List<Book> getAllBooks() {
//        return books.values();
        return books.values()
                .stream()
                .toList();
//        return books.values().stream()
//                .sorted(Comparator.comparing(Book::getTitle))
//                .toList();
    }

    // Вывод доступных книг
    public List<Book> getAvailableBooks() {
        return getAllBooks().stream()
                .filter(Book::isAvailable)
                .toList();
    }

    // Вывод доступных книг
    public List<Book> getBorrowedBooks() {
        return getAllBooks().stream()
                .filter(b -> !b.isAvailable())
                .toList();
    }

//    public Map<User, Integer> getUserActivity() {
    public Map<Integer, List<User>> getUserActivity() {
        return users.values().stream()
//                .collect(Collectors.toMap(Function.identity(), User::getBorrowCount));
                .collect(Collectors.groupingBy(
                User::getBorrowCount,
                Collectors.toList()));
    }

    public Map<User, Integer> getUserBooksCount() {
        return users.values().stream()
                .collect(Collectors.toMap(Function.identity(), u -> u.getBooks().size()));
    }

    public Map<User, List<Book>> getUserBooks() {
        return users.values().stream()
                .collect(Collectors.toMap(Function.identity(), User::getBooks));
    }
}
