package ru.ldv236.Collections1.Wrappers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание списка, который может хранить объекты типа Integer
        ArrayList<Integer> numbers = new ArrayList<>();

        // Автоупаковка: добавление примитивного значения int в ArrayList
        int primitiveValue = 10;
        numbers.add(primitiveValue);  // Автоупаковка происходит здесь

        // Автоупаковка: добавление ещё нескольких значений
        numbers.add(20);  // Примитив 20 автоматически упаковывается в объект Integer
        numbers.add(Integer.parseInt("100"));

        // Распаковка: получение значения из ArrayList
        Integer firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);  // Распаковка из Integer в int

        // Можно выполнять арифметические операции, распаковка происходит автоматически
        int sum = firstNumber + secondNumber;  // Распаковка + сложение
        System.out.println("Сумма: " + sum);  // Вывод: 30

        String text = "1q23we";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                System.out.print("digit ");
            } else if (Character.isLetter(text.charAt(i))) {
                System.out.print("letter ");
            }
            System.out.print(Character.toUpperCase(text.charAt(i)) + " ");
        }
    }
}
