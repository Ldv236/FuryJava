package ru.ldv236.OOP.abstraction2.model;

import ru.ldv236.OOP.abstraction2.interfaces.Refuelable;

public class Car extends MotorTransport implements Refuelable {
    private int doors;

    public Car(String model, int year, String engineType, int doors) {
        super(model, year, engineType);
        this.doors = doors;
    }

    @Override
    public void describe() {
        System.out.println("Car: " + model + " (" + year + "), Doors: " + doors);
    }

    // переопред наслед из мувбл через Транспорт
    @Override
    public void start() {
        System.out.println("Car " + model + " with " + doors + " doors is starting.");
    }

    public void honk() {
        System.out.println("Beep! Beep!");
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + ", doors=" + doors + "}";
    }
}
