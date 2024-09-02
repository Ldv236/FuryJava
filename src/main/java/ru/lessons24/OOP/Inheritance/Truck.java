package ru.lessons24.OOP.Inheritance;

public class Truck extends Transport {
    private int loadCapacity;

    public Truck(String model, int year, int loadCapacity) {
        super(model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void describe() {
        System.out.println("Truck: " + model + " (" + year + "), Load Capacity: " + loadCapacity + " kg");
    }

    @Override
    public void start() {
        System.out.println(model + " is engaging gears and starting to move.");
    }

    public void load() {
        System.out.println("Loading the truck with capacity: " + loadCapacity + " kg");
    }
}
