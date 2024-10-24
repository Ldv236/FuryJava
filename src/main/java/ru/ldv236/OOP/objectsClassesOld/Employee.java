package ru.ldv236.OOP.objectsClassesOld;

public class Employee extends Person {

    private int salary;

    public Employee(String name, Integer age, int salary) {
        super(name, age);
        this.salary = salary;
    }
}
