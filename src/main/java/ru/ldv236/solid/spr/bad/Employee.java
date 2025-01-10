package ru.ldv236.solid.spr.bad;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void saveToDatabase() {
        // Логика сохранения в базу данных
        System.out.println("Сотрудник сохранён в базу данных.");
    }

    public void calculateWorkDays() {
        // Логика расчета
        System.out.println("Расчитываем количество рабочих дней");
    }

    public void calculateSalary() {
        // Логика расчета
        calculateWorkDays();
        System.out.println("Расчитываем количество рабочих дней");
    }

    public void calculateVacation() {
        // Логика расчета отпуска
        calculateWorkDays();
        System.out.println("Расчитываем количество рабочих дней");
    }
}
