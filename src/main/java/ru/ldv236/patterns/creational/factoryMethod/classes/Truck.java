package ru.ldv236.patterns.creational.factoryMethod.classes;

// Класс грузовика (реализует интерфейс Vehicle)
public class Truck implements Vehicle {
    @Override
    public String getName() {
        return "Truck";
    }

    @Override
    public void deliver() {
        System.out.println("Delivering by land in a box.");
    }
}
