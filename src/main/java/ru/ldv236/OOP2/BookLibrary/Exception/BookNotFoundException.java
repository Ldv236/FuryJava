package ru.ldv236.OOP2.BookLibrary.Exception;

public class BookNotFoundException  extends RuntimeException {

    private static final String MESSAGE = "Book not found [id - %d]";

    public BookNotFoundException(Integer bookId) {
        super(MESSAGE.formatted(bookId));
    }
}
