package ru.ldv236.Collections2.streamApiOld;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTasks {
    void doTask1() {
        //Дан список целых чисел. Найдите все уникальные четные числа в этом списке.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 4, 6, 6);
        Collection<Integer> evenNums = numbers.stream()
            .filter(n -> n % 2 == 0)
            .collect(Collectors.toSet());

        System.out.println(evenNums);
    }

    void doTask2() {
        //Дан список целых чисел. Найдите сумму всех чисел в этом списке.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 4, 6, 6);
        int sum = numbers.stream()
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(sum);
    }

    void doTask3() {
        //Дан список целых чисел. Найдите сумму всех чисел в этом списке.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 4, 4, 6, 6);

        //через интСтрим
        int max = numbers.stream()
            .mapToInt(Integer::intValue)
            .max().getAsInt();
        System.out.println(max);

        //без интСтрим
        int max2 = numbers.stream()
            .max(Integer::compareTo).get();
        System.out.println(max2);

        //без интСтрим с Optional
        Optional<Integer> max3 = numbers.stream()
            .max(Integer::compareTo);
        max3.ifPresent(System.out::println);
    }

    void doTask4() {
        //Дан список строк. Преобразуйте его в список, содержащий длины этих строк.
        List<String> words = Arrays.asList("Java", "Stream", "API", "Examples");
        Collection<Integer> lengths = words.stream()
            .map(String::length)
//            .map(w -> w.length())
            .collect(Collectors.toList());
        System.out.println(lengths);
    }

    void doTask5() {
        //Дан список строк. Объедините все строки в одну строку, разделенные пробелами.
        List<String> words = Arrays.asList("Java", "Stream", "API", "Examples");

        String result = words.stream()
            .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    void doTask6() {
        //Дан список целых чисел. Найдите среднее значение этих чисел.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 8);
        double average = numbers.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);

        // Ограничение до 2 знаков после запятой
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(average));
    }
}
