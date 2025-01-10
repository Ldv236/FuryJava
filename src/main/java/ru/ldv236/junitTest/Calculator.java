package ru.ldv236.junitTest;

public class Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) a / b;
    }

    public boolean isPositive(int number) {
        return number > 0;
    }
}
