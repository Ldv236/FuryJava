package ru.ldv236.OOP.abstraction2.model;

import ru.ldv236.OOP.abstraction2.interfaces.Movable;

public abstract class Transport implements Movable {
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

    // переопред из мувбл
    @Override
     abstract public void start();

    // Переопределение toString() для базовых полей
    @Override
    public String toString() {
        return "model='" + model + "', year=" + year;
    }
}
