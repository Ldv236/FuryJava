package ru.ldv236.Collections2.streamApiOld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamWithArray {
    void doStream() {

        // Шаг 1: Создание массива целых чисел
        Integer[] numbersAr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Шаг 2-5: Преобразование в поток, фильтрация, преобразование и вывод
        Arrays.stream(numbersAr) // Преобразование массива в поток
                .filter(n -> n % 2 == 0) // Фильтрация: оставляем только четные числа
                .map(n -> n * 2) // Преобразование: умножаем каждое число на 2
                .forEach(System.out::println); // Вывод результатов на экран


        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("JavaScript");
        names.add("Python");
        names.add("C++");
        names.add("Julia");

        List<String> filteredSortedNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .filter(name -> name.length() > 4)
                .sorted()
                .sorted((n1, n2) -> n1.length() - n2.length())
                .collect(Collectors.toList());

        System.out.println(filteredSortedNames); // Вывод: [Java, JavaScript, Julia]

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4));
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);

//        int sumOfSquares = numbers.stream()
        double sumOfSquares = numbers.stream()
//                .map(n -> n * n)
                .map(n -> Math.pow(n, 2))
//                .reduce(0, Integer::sum);
//                .reduce(0.0, Double::sum);
//                .reduce((acc, d) -> acc + d).get();
                .reduce(Double::sum).get();

        System.out.println(sumOfSquares); // Вывод: 30 (1+4+9+16)



        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("HTML");
        words.add("CSS");
        words.add("JavaScript");

        Map<Integer, List<String>> groupedByLength = words.stream()
//                .collect(Collectors.groupingBy(String::length));
                .collect(Collectors.groupingBy((str) -> str.length()));

        System.out.println(groupedByLength);
        // Вывод: {3=[CSS], 4=[Java, HTML], 10=[JavaScript]}

        doMistake(10);
    }

    static void doMistake(int requestIndex) {
        if (requestIndex > 5) {
            throw new RuntimeException("Error");
        }
        System.out.println("requestIndex: " + requestIndex);

    }
}
