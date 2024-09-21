package ru.lessons24.Collections1.Homework;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final List<String> drivers;
    private final List<String> students;

    public Car() {
        this.drivers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    // Добавление водителя и ученика в списки
    public void addDriverAndStudent(String driver,
                                    String student) {
        drivers.add(driver);
        students.add(student);
    }

    public List<String> getStudents() {
        return students;
    }

    // Получить список водителей
    public List<String> getDrivers() {
        return drivers;
    }
}
