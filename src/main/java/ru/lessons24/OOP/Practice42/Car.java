package ru.lessons24.OOP.Practice42;

public class Car extends Transport {
    private int doors;

    public Car(String model, int year, int doors) {
        super(model, year);
        this.doors = doors;
    }

    @Override
    public void describe() {
        System.out.println("Car: " + model + " (" + year + "), Doors: " + doors);
    }

    // переопред наслед из мувбл через Транспорт
    @Override
    public void start() {
        steps++;  // Увеличиваем количество шагов при старте
        System.out.println("Car " + model + " with " + doors + " doors is starting.");
    }

    // переопред наслед из мувбл через Транспорт
    @Override
    public void stop() {
        System.out.println("Car " + model + " is stopping.");
    }

    public void honk() {
        System.out.println("Beep! Beep!");
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + ", doors=" + doors + "}";
    }
}
