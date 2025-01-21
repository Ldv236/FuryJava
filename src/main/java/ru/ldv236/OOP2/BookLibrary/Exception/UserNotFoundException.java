package ru.ldv236.OOP2.BookLibrary.Exception;

public class UserNotFoundException extends RuntimeException {

    private static final String MESSAGE = "User not found [id - %d]";

    public UserNotFoundException(Integer userId) {
        super(MESSAGE.formatted(userId));
    }
}
