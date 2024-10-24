package ru.ldv236.Collections2.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // можем использовать неизменяемые коллекции, т.к. стрим их и не собирается изменять
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 6, 7, 8);

        // Фильтрация четных чисел
        List<Integer> evenNumbers = numbers.stream()
                .filter((n) -> {return n % 2 == 0;})
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
                .toList();
        System.out.println("Even numbers: " + evenNumbers); // Output: [2, 2, 4, 6, 6, 6, 8]


        long count = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Count of even numbers: " + count); // Output: 5


        // Поиск минимального значения
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        min.ifPresent(m -> System.out.println("Min: " + m)); // Output: Min: 2


        // Поиск максимального значения
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        max.ifPresent(m -> System.out.println("Max: " + m)); // Output: Max: 9


        // Получение уникальных элементов
        List<Integer> distinctNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .toList();
        System.out.println("Distinct numbers: " + distinctNumbers); // Output: [2, 4, 6, 8]


        // Вычисление суммы всех чисел
        int sum = numbers.stream()
                .mapToInt(Integer::intValue) // Преобразуем в IntStream
                .sum();
        System.out.println("Sum: " + sum); // Output: 15


        // Пропустить первые 2 и взять следующие 3
        List<Integer> result = numbers.stream()
                .skip(4)
                .limit(3)
                .toList();
        System.out.println("After skip and limit: " + result); // Output: [3, 4, 5]


        List<String> names = Arrays.asList("Alexander", "Kate", "Bob", "John", "Any", "Ed");
        // Преобразование в верхний регистр
        List<String> upperCaseNames = names.stream()
                .map(s -> s.toUpperCase())
//                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase names: " + upperCaseNames); // Output: [ALEXANDER, KATE, BOB]


        // Сортировка строк по их длине
        List<String> sortedByLength = names.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .toList();
        System.out.println("Sorted by length: " + sortedByLength); // Output: [Bob, Kate, Alexander]


        // Группировка строк по их длине
        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupedByLength);
        // Output: Grouped by length: {3=[Bob], 4=[John, Kate], 9=[Alexander]}
    }
}
