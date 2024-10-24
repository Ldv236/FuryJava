package ru.ldv236.core.numbers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double value = 2.0 - 1.1;
        System.out.println("value raw double - " + value);

        System.out.println("value round - " + Math.round(value * 100.0) / 100.0);

        BigDecimal value2 = BigDecimal.valueOf(value);
        BigDecimal roundedValue = value2.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Округленное значение: " + roundedValue);

        BigDecimal a = new BigDecimal("2.0");
        BigDecimal b = new BigDecimal("1.1");
        BigDecimal value3 = a.subtract(b);
        System.out.println("value - " + value3); // Вывод: value - 0.9

        double value4 = 2.0 / 3;
        System.out.println("value - " + value2);
    }
}