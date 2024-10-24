package ru.ldv236.OOP.EqualsHashCode;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "model='" + model + "', year=" + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Transport transport = (Transport) obj;
        return year == transport.year && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}
