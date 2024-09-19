package ru.lessons24.OOP.Final;

public final class Car extends Transport {
    // идея подсказывает про файнал - потому что нет сеттера, только инициализация в конструкторе
    // показать что если сделать сеттер, то подсказка исчезнет, либо сделать файнал двери
    private int doors;

    public Car(String model, int year, int doors) {
        super(model, year);
        this.doors = doors;
    }

//    @Override
//    public void describe() {
//        System.out.println("Car: " + model + " (" + year + "), Doors: " + doors);
//    }

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
