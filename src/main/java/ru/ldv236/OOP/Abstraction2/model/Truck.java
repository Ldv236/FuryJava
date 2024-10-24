package ru.ldv236.OOP.Abstraction2.model;

import ru.ldv236.OOP.Abstraction2.interfaces.Refuelable;

public class Truck extends MotorTransport implements Refuelable {
    private int loadCapacity;

    public Truck(String model, int year, String engineType, int loadCapacity) {
        super(model, year, engineType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void describe() {
        System.out.println("Truck: " + model + " (" + year + "), Load Capacity: " + loadCapacity + " kg");
    }

    // переопред наслед из мувбл через Транспорт
    @Override
    public void start() {
        System.out.println("Truck " + model + " is starting with capacity " + loadCapacity + " tons.");
    }

    public void load() {
        System.out.println("Loading the truck with capacity: " + loadCapacity + " kg");
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + ", loadCapacity=" + loadCapacity + " tons}";
    }
}
