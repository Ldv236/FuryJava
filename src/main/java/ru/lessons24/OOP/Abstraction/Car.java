package ru.lessons24.OOP.Abstraction;

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

    @Override
    public void start() {
        System.out.println(model + " is revving the engine and starting to move.");
    }

    public void honk() {
        System.out.println("Beep! Beep!");
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "doors=" + doors +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                '}';
//    }

    // Переопределение toString() с вызовом родительского метода
    @Override
    public String toString() {
        return "Car{" + super.toString() + ", doors=" + doors + "}";
    }
}
