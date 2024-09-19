package ru.lessons24.Collections1.Generics;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + "}";
    }
}
