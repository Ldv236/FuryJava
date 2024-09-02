package ru.lessons24.core.types;

public class Wrappers {
    public static void main(String[] args) {

        // показать константы в интеджере
        Integer number0 = Integer.valueOf(10);
        double pi = Math.PI;
        // показать что внутри хранится примитив
        Integer number = Integer.valueOf(10);
        Integer number2 = Integer.valueOf("10");
        Double number3 = Double.valueOf(10.0);
        // показать что он внутри сравнивается с 127, т.е. оперирует под капотом числами
        Character character = Character.valueOf('A');




        int iterations = 100_000_000; // Количество итераций для теста

        // Тест для int
        long startTimeInt = System.currentTimeMillis(); // Начало измерения времени
        int sumInt = 0;
        for (int i = 0; i < iterations; i++) {
            sumInt += i;
        }
        long endTimeInt = System.currentTimeMillis(); // Конец измерения времени
        long durationInt = endTimeInt - startTimeInt;
        System.out.println("Время выполнения для int: " + durationInt);

        // Тест для Integer
        long startTimeInteger = System.currentTimeMillis(); // Начало измерения времени
        Integer sumInteger = 0;
        for (int i = 0; i < iterations; i++) {
            sumInteger += i;
        }
        long endTimeInteger = System.currentTimeMillis(); // Конец измерения времени
        long durationInteger = endTimeInteger - startTimeInteger;
        System.out.println("Время выполнения для Integer: " + durationInteger);
        System.out.println("Разница: " + (durationInteger / durationInt) + " раз");

    }
}
