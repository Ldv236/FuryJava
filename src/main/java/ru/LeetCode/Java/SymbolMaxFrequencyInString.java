package ru.LeetCode.Java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SymbolMaxFrequencyInString {

    public static void main(String[] args) {
        String input = "example string with repeated characters";

        // Находим символ с максимальной частотой
        char maxChar = findMaxFrequencyChar(input);
        System.out.println("Символ, встречающийся максимальное количество раз: " + maxChar);

        maxChar = findMaxFrequencyCharStream(input);
        System.out.println("Символ, встречающийся максимальное количество раз: " + maxChar);

        maxChar = findMaxFrequencyCharArray(input);
        System.out.println("Символ, встречающийся максимальное количество раз: " + maxChar);
    }

    public static char findMaxFrequencyChar(String str) {
        // Инициализируем HashMap для хранения количества вхождений каждого символа
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Проходим по всем символам в строке
        for (char c : str.toCharArray()) {
            // Увеличиваем счетчик для данного символа
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Инициализируем переменные для хранения символа с максимальной частотой
        char maxChar = ' ';
        int maxFrequency = 0;

        // Ищем символ с максимальной частотой
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }


    public static char findMaxFrequencyCharStream(String str) {
        // Используем Stream API для создания карты частот символов
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Ищем символ с максимальной частотой
        return frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("Строка не должна быть пустой"));
    }


    public static char findMaxFrequencyCharArray(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка не должна быть пустой");
        }

        // Преобразуем строку в массив символов и сортируем его
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        // Инициализируем переменные для хранения символа с максимальной частотой
        char maxChar = chars[0];
        int maxFrequency = 1;
        int currentFrequency = 1;

        // Проходим по отсортированному массиву и ищем символ с максимальной частотой
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                currentFrequency++;
            } else {
                if (currentFrequency > maxFrequency) {
                    maxFrequency = currentFrequency;
                    maxChar = chars[i - 1];
                }
                currentFrequency = 1;
            }
        }

        // Последняя проверка на случай, если последний символ имеет максимальную частоту
        if (currentFrequency > maxFrequency) {
            maxChar = chars[chars.length - 1];
        }

        return maxChar;
    }
}
