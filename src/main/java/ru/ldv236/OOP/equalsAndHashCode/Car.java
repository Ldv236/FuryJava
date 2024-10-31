package ru.ldv236.OOP.equalsAndHashCode;

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

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return doors == car.doors;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
//        return Objects.hash(super.hashCode(), doors);
    }
}
