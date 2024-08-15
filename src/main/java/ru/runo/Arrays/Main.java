package ru.runo.Arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Объявление массива целых чисел длиной 5
//        int[] numbers = new int[5];

        // Объявление массива строк длиной 3
//        String[] words = new String[3];

        // Объявление и инициализация массива целых чисел
//        int[] numbers2 = {1, 2, 3, 4, 5};

        // Объявление и инициализация массива строк
//        String[] words2 = {"apple", "banana", "cherry"};

        int[] numbers;
        numbers = new int[]{4, 2, 1, 5, 3};

        String[] words;
        words = new String[]{"apple", "banana", "cherry"};

        // Доступ к элементу по индексу
        int firstNumber = numbers[0];
        System.out.println("Элемент массива по индексу 0 - " + firstNumber);

        numbers[0] = 12;
        System.out.println("Новое значение элемента с индексом 0 - " + numbers[0]);

        //Итерация по массиву
        for (int i = 0; i < numbers.length; i++) {
            //сначала просто вывод, а сравнение с i-1 после цикла foreach для демонстрации возможностей доступа
            System.out.print(numbers[i] + " ");

            if (i == 0) {
                System.out.println("Первый элемент");
            } else {
                System.out.println(numbers[i] > numbers[i - 1] ? "больше предыдущего" : "меньше предыдущего");
            }
        }
        System.out.println();

        for (int number : numbers) {
//            if (number % 2 == 0) {
                System.out.print(number + ",");
//            }
            //в практическом задании обратная итерация и определение четности
            //а еще итерирование через один
        }
        System.out.println();

        // Сортировка массива
        Arrays.sort(numbers);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        //Копирование массива
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numbersCopy));

        //[0, 1, 2, 3, 4] индексы
        //[1, 2, 3, 4, 5] элементы
        int[] numbersCopy2 = new int[3];
        System.arraycopy(numbers, 2, numbersCopy2, 0, 3);
        System.out.println(Arrays.toString(numbersCopy2));
    }
}
