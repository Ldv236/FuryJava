package ru.lessons24.core.Exceptions;

public class BadAgeException extends RuntimeException {

    public BadAgeException(String message) {
        super(message);
    }
}