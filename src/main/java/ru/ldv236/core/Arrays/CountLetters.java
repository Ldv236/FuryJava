package ru.ldv236.core.Arrays;

public class CountLetters {
    public static void main(String[] args) {
/*
Напишите программу, которая считает количество вхождений каждой латинской буквы в заданной строке.
Программа должна использовать массив int[26], где каждый элемент массива соответствует
числу вхождений конкретной буквы в строке.
Индексы массива соответствуют буквам: 0 — это буква 'a', 1 — это буква 'b',
и так далее до 25, что соответствует букве 'z'.

Входная строка может содержать как строчные (a-z), так и заглавные буквы (A-Z).
Программа должна игнорировать регистр, т.е. 'A' и 'a' должны считаться как одна и та же буква.
Символы, не являющиеся латинскими буквами, нужно игнорировать.
В конце программа должна вывести количество каждой буквы, если она встречалась хотя бы один раз.
 */

//        countLetters("grafinya izmenivshimsya litcom bezhit prudu");
        countLetters("Графиня изменившимся ЛИЦОМ БЕЖИТ ПРУДУ");
    }

    static void countLetters(String input) {
//        String cleaned = input.toLowerCase().replaceAll("[^a-z]", "");
        String cleaned = input.toLowerCase().replaceAll("[^а-я]", "");
//        if (Character.isLetter(c) && c >= 'A' && c <= 'z') {
//            char lowerCaseChar = Character.toLowerCase(c);
        char[] stringToChars = cleaned.toCharArray();
        // Массив для подсчета букв: индекс 0 - это 'a', 1 - 'b' и так далее.
        //int[] letterCounts = new int[26];
        int[] letterCounts = new int[33];
        int index;

        // Подсчет букв в строке
        for (char c : stringToChars) {
//            index = c - 'a'; // Определяем индекс в массиве
            index = c - 1072; // Определяем индекс в массиве для кириллицы (маленькие буквы)
            letterCounts[index]++;
        }

        // Вывод результатов подсчета
//        System.out.println("Подсчет латинских букв в строке:");
        System.out.println("Подсчет кириллических букв в строке:");
        for (int i = 0; i < letterCounts.length; i++) {
//            if (letterCounts[i] > 0) {
//            System.out.printf("%c : %d%n", (char) ('a' + i), letterCounts[i]);
            System.out.printf("%c : %d%n", (char) (1072 + i), letterCounts[i]);
//            }
        }
    }
}
