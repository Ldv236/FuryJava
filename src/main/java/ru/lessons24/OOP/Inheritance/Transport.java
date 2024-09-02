package ru.lessons24.OOP.Inheritance;

public class Transport {
    protected String model;
    protected int year;

    // Конструктор суперкласса
    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Метод для описания транспорта
    public void describe() {
        System.out.println("Transport: " + model + " (" + year + ")");
    }

    // Метод для начала движения
    public void start() {
        System.out.println(model + " is starting to move.");
    }
}
