package ru.lessons24.Debug;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Арифметические операции с целыми числами
        int a = 10;
        int b = 5;

        int sum = a + b;        // Сложение
        int difference = a - b; // Вычитание
        int product = a * b;    // Умножение
        int quotient = a / b;   // Деление
        int remainder = a % b;  // Остаток от деления

        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Остаток от деления: " + remainder);


        // Операции с символами
        char char1 = 'A';
        char nextChar = (char) (char1 + 1); // Получение следующего символа


        // ПРИВЕДЕНИЕ ТИПОВ !!!!!!!!!!11
        // Автоматическое (неявное) приведение типов
        int intVal = 100;
        long longVal = intVal; // int автоматически приводится к long
        double doubleVal = longVal; // long автоматически приводится к double

        // Явное приведение типов (сужение типа)
        double doubleValue = 9.78;
        int intFromDouble = (int) doubleValue; // Явное приведение double к int, дробная часть отбрасывается


        // Приведение типов с потерей данных
        int largeInt = 128;
        byte byteVal = (byte) largeInt; // int явно приводится к byte, возможна потеря данных

        byte byteVal2 = 126;
        byteVal2++;
        byteVal2++;
        byteVal2++;
        byteVal2--;
        byteVal2--;
        byteVal2--;


        boolean isCold = false;
        boolean isShine = false;

        if (isCold) {
            System.out.println("Надо надеть шапку");
        } else if (isShine) {
            System.out.println("Надо надеть кепку");
        } else {
            System.out.println("Головной убор не нужен");
        }



        //объявляем целочисленную (int) переменную
        int number;
        //инициализируем переменную случайным числом от 1 до 9
        Random rand = new Random();
        number = rand.nextInt(1, 10);
        System.out.print("Печать дня из case, " + number + " - ");


        String day;
        day = switch (number) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверный номер дня недели";
        };
    }
}
