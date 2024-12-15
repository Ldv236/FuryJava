package ru.ldv236.Collections2.StreamToMaps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Clean Code", 2008),
                new Book("Effective Java", 2001),
                new Book("Java 8 in Action", 2014),
                new Book("Refactoring", 2008)
        );

        // Группировка по году издания
        Map<Integer, List<Book>> booksByYear = books.stream()
                .collect(Collectors.groupingBy(Book::getYear));

        System.out.println(booksByYear);

        // Разделение на книги до 2010 года и после
        Map<Boolean, List<Book>> partitionedBooks = books.stream()
                .collect(Collectors.partitioningBy(book -> book.getYear() < 2010));

        System.out.println(partitionedBooks);

        // Мапа с названием книги как ключом и годом как значением
        Map<String, Integer> bookMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getYear));

        System.out.println(bookMap);
    }
}
