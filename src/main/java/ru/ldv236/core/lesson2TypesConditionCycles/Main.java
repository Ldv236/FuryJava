package ru.ldv236.core.lesson2TypesConditionCycles;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
//        doSomething();
        getMinMaxValues();
    }

    static void doSomething() {
                int countApples = 10;
        String description = "Количество яблок: ";

        boolean isValid = true;
        boolean isValid2 = false;

        if (countApples > 6) {
            System.out.println(description + countApples);
            if (isValid) {
                isValid2 = true;
            }
            System.out.println("isValid2 - " + isValid2);
        } else if (countApples > 2) {
            System.out.println("что-то еще");
        }

        int day = 4;

        byte age = 127;
        long number = 111111L;

        double pi = 3.14;
        float pii = 3.14f;

        char letter = 'A';
        String name = "Dmitry";


        switch (day) {
            case 1:
            case 2:
                System.out.println("Понедельник или Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Такого дня не найдено");
        }

        int a = 0;
        while (a <= 5) {
            System.out.println("что-то еще");
//            a = a + 1;
            a += 2;
//            a ++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("счет - " + i);
        }

//        int i;
//        for (i = 0; ; i++) {
//            System.out.println("счет - " + i);
//        }
        List<Integer> intList = new ArrayList<>();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        for (int i = 0; i < 10_000_000; i++) {
            intList.add(threadLocalRandom.nextInt(100));
        }
        int currentIntFromList = 0;

        long start = System.currentTimeMillis();
        for (int i = 0; i < intList.size(); i++) {
            currentIntFromList = intList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));

        start = System.currentTimeMillis();
        for (int i = 0, n = intList.size(); i < n; i++) {
            currentIntFromList = intList.get(i);
        }
        end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));

        start = System.currentTimeMillis();
        for (Integer integer : intList) {
            currentIntFromList = integer;
        }
        end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }

    static void getMinMaxValues() {
        //Напишите программу, которая находит наибольший и наименьший элемент в массиве целых чисел.
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}