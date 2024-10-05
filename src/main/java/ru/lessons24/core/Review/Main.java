package ru.lessons24.core.Review;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Charlie", "David"};
        printNamesStartingWithA(names);

        System.out.println("Сумма чисел: " + sumArray(new int[]{1, 2, 3, 4, 5}));

        System.out.println("Реверс строки: " + reverseString("Hello"));

        int[] numbers = {1, 2, 3, 4, 5};
        int[] minMax = findMinMaxValues(numbers);
        System.out.println("Min - " + minMax[0] + ", max - " + minMax[1]);

        System.out.println("findMultiplesOfThree - " + Arrays.toString(findMultiplesOfThree(10)));
    }

    // Использовали! Метод для вывода имен, которые начинаются с буквы 'A'
    public static void printNamesStartingWithA(String[] names) {
        for (int i = 0; i <= names.length; i++) {
            if (names[i].substring(0, 1) == "A") {
                System.out.println(names[i]);
            }
        }
    }

    // Метод для суммирования элементов массива
    public static int sumArray(int[] numbers) {
        int sum /* = 0*/; // косяк с инициалиацией
        for (int i = 1; i < numbers.length; i++) { //косяк с начальным значением
            sum = +numbers[i]; //косяк с оператором
        }
//        return sum;
        return 0;
        // Недочет: Можно использовать enhanced for loop для упрощения
    }

    /*
        public static String reverseString(String str) {
            for (int i = 0; i <= str.length(); i++) {
                String reversed = "";
                reversed += str.charAt(i);
            }
            return reversed;
        }
        */
    // Метод для реверса строки
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i <= str.length(); i++) { // Ошибка: i <= str.length() приведет к StringIndexOutOfBoundsException
            reversed.append(str.charAt(i)); // Недочет: Конкатенация строк в цикле создает много ненужных объектов String
        }
        return reversed.toString();
    }

    // КОД-РЕВЬЮ и ПРОВЕРКА КОРНЕР-КЕЙСОВ
    // Метод для поиска максимального значения в массиве
    public static int[] findMinMaxValues(int[] numbers) { //{1, -4, 2, -1} или подобный
        int max = 0; // Недочет: если массив содержит отрицательные числа, это даст неправильный результат
        int min = 0;

        for (int i = 1; i < numbers.length - 1; i++) { // Ошибка
            int x = numbers[i]; //создание новой переменной на каждой итерации и тупое имя
            if (x > max) {
                max = x;
            } //лучше с элс
            if (x < min) {
                min = x;
            }
        }

        int[] result = new int[2];
        result[0] = min; // можно не объявлять min max а сразу использовать массив result
        result[1] = max;
        return result;
    }

    // Метод для нахождения всех чисел, кратных 3, от 0 до n
    public static int[] findMultiplesOfThree(int n) {
        int[] result = new int[n]; // Недочет: Массив может быть больше, чем нужно
        int count = 0;

        for (int i = 0; i < n; i++) { // не включается последнее число
            if (i % 3 == 0) {
                result[count] = i;
                count++;
            }
        }
        return result; // Ошибка: массив может содержать нули, если count меньше n
    }
}
