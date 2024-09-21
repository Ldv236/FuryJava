package ru.lessons24.Diplom.Exception;

public class BookNotFoundException  extends RuntimeException {

    private static final String MESSAGE = "Book not found [id - %d]";

    public BookNotFoundException(Integer bookId) {
        super(MESSAGE.formatted(bookId));
    }
}
