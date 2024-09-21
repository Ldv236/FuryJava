package ru.lessons24.Diplom;

import ru.lessons24.Diplom.Model.Book;
import ru.lessons24.Diplom.Model.Library;
import ru.lessons24.Diplom.Model.User;

import java.util.List;
import java.util.Map;

public class Main {

    static Library library = new Library();

    public static void main(String[] args) {
        // Добавляем книги
        library.addBook(new Book(1, "О дивный новый мир", "Хаксли О."));
        library.addBook(new Book(2, "Мы", "Замятин Е."));
        library.addBook(new Book(3, "1984", "Оруэлл Дж."));
        // Добавляем пользователей
        library.addUser(new User(1, "Кирилл"));
        library.addUser(new User(2, "Тамара"));
        library.addUser(new User(3, "Сергей"));

        // Выдача книг
        borrowBook(1, 1);
        borrowBook(2, 2);
        borrowBook(3, 3);
        System.out.println();
        // проверка что нельзя взять недоступную книгу
        borrowBook(1, 2);
        borrowBook(2, 1);
        System.out.println();
        // проверка исключений
        borrowBook(4, 1);
        borrowBook(1, 10);
        System.out.println();

        // Возврат книг
        returnBook(1, 1);
        returnBook(2, 2);
        System.out.println();
        // проверка исключений
        returnBook(4, 1);
        returnBook(1, 5);
        System.out.println();
        // проверка что нельзя вернуть небратую книгу
        returnBook(1, 1);
        System.out.println();

        // Вывод книг
        System.out.println("Все книги: " + library.getAllBooks());
        System.out.println("Доступные книги: " + library.getAvailableBooks());
        System.out.println("Выданные книги: " + library.getBorrowedBooks());
        System.out.println();

        // найти самого активного читателя
        returnBook(3, 3);
        borrowBook(1, 2);
        borrowBook(1, 3);
        returnBook(1, 3);
        borrowBook(2, 3);
        borrowBook(2, 1);
        System.out.println();

//        Map<User, Integer> userActivity = library.getUserActivity();
//        for (Map.Entry<User, Integer> entry : userActivity.entrySet()) {
//            System.out.println(entry.getKey() + " - всего брал книг: " + entry.getValue());
//        }
//        userActivity.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " - всего брал книг: " + e.getValue()));
//        userActivity.entrySet().forEach(e -> System.out.println(e.getKey() + " - всего брал книг: " + e.getValue()));
//        userActivity.forEach((key, value) -> System.out.println(key + " - всего брал книг: " + value));
        Map<Integer, List<User>> userActivity = library.getUserActivity();
        userActivity.forEach((key, value) -> System.out.println(key + " - книг брали: " + value));
        System.out.println();

        Map<User, Integer> userBooksCount = library.getUserBooksCount();
        userBooksCount.forEach((u, c) -> System.out.println(u + " - книг на руках: " + c));
        System.out.println();

        Map<User, List<Book>> userBooks = library.getUserBooks();
        userBooks.forEach((u, b) -> System.out.println(u + " - книги на руках: " + b));
    }

    static void borrowBook(int userId, int bookId) {
        try {
            library.borrowBook(userId, bookId);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    static void returnBook(int userId, int bookId) {
        try {
            library.returnBook(userId, bookId);
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
