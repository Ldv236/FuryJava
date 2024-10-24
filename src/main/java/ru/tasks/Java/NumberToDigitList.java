package ru.tasks.Java;

import java.util.*;

public class NumberToDigitList {
    public static void main(String[] args) {
        int source = 123456;
        System.out.println(numberToList(source));
        System.out.println(numberToLinkedList(source));
        System.out.println(numberToDequeList(source));
    }


    public static List<Integer> numberToList(int number) {
        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.reverse(digits);

        if (digits.isEmpty()) {
            digits.add(0);
        }

        return digits;
    }

    public static List<Integer> numberToLinkedList(int number) {
        List<Integer> digits = new LinkedList<>();

        while (number > 0) {
            digits.add(0, number % 10); // Добавляем в начало списка
            number /= 10;
        }

        if (digits.isEmpty()) {
            digits.add(0);
        }

        return digits;
    }

    public static Deque<Integer> numberToDequeList(int number) {
        Deque<Integer> digits = new ArrayDeque<>();

        while (number > 0) {
            digits.push(number % 10); // Добавляем в начало списка
            number /= 10;
        }

        if (digits.isEmpty()) {
            digits.push(0);
        }

        return digits;
    }
}