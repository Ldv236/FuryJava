package ru.lessons24.Collections1.Homework;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<String> drivers;
    private List<String> students;

    public Car() {
        this.drivers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Добавление водителя и ученика в списки
    public void addDriverAndStudent(String driver, String student) {
        drivers.add(driver);
        students.add(student);
    }

    // Получить список водителей
    public List<String> getDrivers() {
        return drivers;
    }
}
