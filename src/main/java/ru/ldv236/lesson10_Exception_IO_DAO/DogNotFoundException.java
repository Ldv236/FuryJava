package ru.ldv236.lesson10_Exception_IO_DAO;

public class DogNotFoundException extends RuntimeException {

    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
