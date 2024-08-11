package ru.ldv236.string;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        String x = "java";
        String y = "java";
        System.out.println(x == y);

        x = x.toUpperCase();
        y = y.toUpperCase();
        System.out.println(x == y);

        x = x.toUpperCase().intern();
        y = y.toUpperCase().intern();
        System.out.println(x == y);
    }
}