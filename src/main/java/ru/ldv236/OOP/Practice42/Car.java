package ru.ldv236.OOP.Practice42;

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
    public void start(int stepCount) {
//        steps++;  // Увеличиваем количество шагов при старте
        steps += stepCount;  // Увеличиваем количество шагов при старте
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
