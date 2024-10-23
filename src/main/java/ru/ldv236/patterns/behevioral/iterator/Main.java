package ru.ldv236.patterns.behevioral.iterator;

public class Main {
    public static void main(String[] args) {
        // Создаем коллекцию книг
        BookCollection collection = new BookCollection(3);
        collection.addBook(new Book("The Catcher in the Rye"));
        collection.addBook(new Book("To Kill a Mockingbird"));
        collection.addBook(new Book("1984"));

        // Получаем итератор и обходим коллекцию
        Iterator<Book> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book title: " + book.getTitle());
        }
    }
}