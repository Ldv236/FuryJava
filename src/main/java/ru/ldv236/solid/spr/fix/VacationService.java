package ru.ldv236.solid.spr.fix;

public class VacationService {

    public void calculateSalary() {
        // Логика расчета
        calculateWorkDays();
        System.out.println("Расчитываем количество рабочих дней");
    }

    public void calculateWorkDays() {
        // Логика расчета
        System.out.println("Расчитываем количество рабочих дней");
    }
}
