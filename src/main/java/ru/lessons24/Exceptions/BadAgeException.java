package ru.lessons24.Exceptions;

public class BadAgeException extends RuntimeException {

    public BadAgeException(String message) {
        super(message);
    }
}
