package ru.ldv236.Diplom.Exception;

public class UserNotFoundException extends RuntimeException {

    private static final String MESSAGE = "User not found [id - %d]";

    public UserNotFoundException(Integer userId) {
        super(MESSAGE.formatted(userId));
    }
}
