package ru.lessons24.OOP.Abstraction2.model;

public class Bike extends Transport {
    private boolean hasGears;

    public Bike(String model, int year, boolean hasGears) {
        super(model, year);
        this.hasGears = hasGears;
    }

    @Override
    public void describe() {
        System.out.println("Bike: " + model + " (" + year + "), Gears: " + (hasGears ? "Yes" : "No"));
    }

    @Override
    public void start() {
        System.out.println(model + " is starting to pedal.");
    }

    public void ringBell() {
        System.out.println("Ring! Ring!");
    }

    // Переопределение toString() с вызовом родительского метода
    @Override
    public String toString() {
        return "Bike{" + super.toString() + ", hasGears=" + hasGears + "}";
    }
}
