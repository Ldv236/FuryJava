package ru.lessons24.OOP.Final;

public final class Truck extends Transport {
    private int loadCapacity;

    public Truck(String model, int year, int loadCapacity) {
        super(model, year);
        this.loadCapacity = loadCapacity;
    }

//    @Override
//    public void describe() {
//        System.out.println("Truck: " + model + " (" + year + "), Load Capacity: " + loadCapacity + " kg");
//    }

    // переопред наслед из мувбл через Транспорт
    @Override
    public void start() {
        System.out.println("Truck " + model + " is starting with capacity " + loadCapacity + " tons.");
    }

    // переопред наслед из мувбл через Транспорт
    @Override
    public void stop() {
        System.out.println("Truck " + model + " is stopping.");
    }

    public void load() {
        System.out.println("Loading the truck with capacity: " + loadCapacity + " kg");
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() + ", loadCapacity=" + loadCapacity + " tons}";
    }
}
