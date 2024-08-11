package ru.ldv236.patterns.varargs;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3)); // Выведет 6
        System.out.println(sum(1, 2, 3, 4, 5)); // Выведет 15
        System.out.println(sum()); // Выведет 0
    }

    public static int sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
