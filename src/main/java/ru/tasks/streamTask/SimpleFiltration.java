package ru.tasks.streamTask;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SimpleFiltration {

//написать метод, принимающий список (либо массив) Integer, вернуть только положительные элементы в отсортированном порядке
//сразу понять как кандидат читает условие на английском (чтение технического английского)

/*
Java 8+, do not use primitives
Please implement:
return a new array with positive numbers only from a given array.
the elements in the resulting array shall be sorted in ascending order.
*/

    public List<Integer> processArray(List<Integer> source) {
        if (source == null) {
            throw new RuntimeException("Source list cannot be null");
        }

        return source.stream()
                .filter(Objects::nonNull)       // Заменили на Objects::nonNull
                .filter(n -> n > 0)             // Оставляем только положительные числа
                .sorted()                       // Сортируем в порядке возрастания
                .collect(Collectors.toList());  // Собираем результат в список
    }

    public Integer[] processArray(Integer[] source) {
        if (source == null) {
            throw new RuntimeException("Source array cannot be null");
        }

        return Arrays.stream(source)
                .filter(Objects::nonNull)
                .filter(n -> n > 0)
                .sorted()
                .toArray(Integer[]::new);
    }
}
