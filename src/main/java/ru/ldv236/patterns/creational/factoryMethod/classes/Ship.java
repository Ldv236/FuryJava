package ru.ldv236.patterns.creational.factoryMethod.classes;

// Класс корабля (реализует интерфейс Vehicle)
public class Ship implements Vehicle {
    @Override
    public String getName() {
        return "Ship";
    }

    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a container.");
    }
}