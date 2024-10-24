package ru.ldv236.Collections1.ListsAndIterators;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String model;
    //добавить список после всего, в конце урока
    private List<String> drivers;

    public Car(String model) {
        this.model = model;
        //добавить список после всего, в конце урока
        drivers = new ArrayList<>();
    }

    // и добавить методы после всего, в конце урока
    public boolean addDriver(String driver) {
        return drivers.add(driver);
    }
    public List<String> getDrivers() {
        return drivers;
    }

    @Override
    public String toString() {
        return "Car(" + model +")";
    }

    // их пишем только после того как увидим, что из списка не удаляется объект
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(model);
    }
}
