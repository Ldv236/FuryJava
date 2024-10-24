package ru.ldv236.core.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
//        int[] arr11 = new int[]; // нипалучаетца
        int[] arr1 = new int[5]; // Массив из 5 элементов, по умолчанию заполнен нулями
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        int[] arr22 = new int[]{10, 20, 30, 40, 50}; // Массив сразу с инициализацией значениями
        int[] arr2 = {10, 20, 30, 40, 50}; // Массив сразу с инициализацией значениями
        String[] names = {"Alice", "Bob", "Charlie"}; // Массив строк

        for (int i = 0; i < arr2.length; i++) { // разница получения длины из строки
            System.out.println("Элемент на позиции " + i + ": " + arr2[i]);
        }

        for (int num : arr2) {
            System.out.println(num);
        }

        int[] unsortedArray = {5, 2, 8, 3, 1};
        java.util.Arrays.sort(unsortedArray); // Сортирует массив по возрастанию
        System.out.println("Отсортированный массив: " + java.util.Arrays.toString(unsortedArray));

        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 7); // Заполняет все элементы массива числом 7
        System.out.println("Заполненный массив: " + java.util.Arrays.toString(filledArray));

        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = java.util.Arrays.copyOf(originalArray, originalArray.length); // Копирует массив
        System.out.println("Скопированный массив: " + java.util.Arrays.toString(copiedArray));

        int[] partialArray = java.util.Arrays.copyOfRange(originalArray, 1, 4); // Копирует элементы с 1 по 3 (не включая 4)
        System.out.println("Часть массива: " + java.util.Arrays.toString(partialArray));

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = java.util.Arrays.equals(array1, array2); // Сравнение массивов
        System.out.println("Массивы равны: " + areEqual);

        int[] sortedArray = {1, 3, 5, 7, 9};
        int index = java.util.Arrays.binarySearch(sortedArray, 5); // Возвращает индекс элемента 5 в отсортированном массиве
        System.out.println("Элемент 5 найден на позиции: " + index);

        String arrayString = java.util.Arrays.toString(sortedArray); // Преобразует массив в строку
        System.out.println("Массив в виде строки: " + arrayString);


        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2; // Умножаем каждый элемент на 2
        }
        System.out.println("Умноженный массив: " + java.util.Arrays.toString(numbers));

        // задачка на практику
        int[] reverseArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < reverseArray.length / 2; i++) {
            int temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length - 1 - i];
            reverseArray[reverseArray.length - 1 - i] = temp;
        }
        System.out.println("Обратный массив: " + java.util.Arrays.toString(reverseArray));

        // 4. Найдем максимальный элемент массива
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("\nМаксимальный элемент: " + max);
    }

    static int findVowelCount(char[] chars) {
        //char[] chars = new char[]{'a', 'B', 'i', 't', 'E', 'r'}; //n = 6
        char[] checkArray = {'a', 'e', 'i', 'o', 'u'};  //m = 5          O(n*m)
        int vowelCount = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < checkArray.length; j++) {
                if (Character.toLowerCase(chars[i]) == checkArray[j]) {
                    vowelCount++;
                }
            }
        }

        return vowelCount;
    }

    static int findDoubled(char[] chars) {
        //char[] chars = new char[]{'a', 'B', 'i', 't', 'E', 'r'}; //n = 6   O(n*n)
        int doubleCount = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                //какие-то проверки, подсчеты
            }
        }
        return doubleCount;
    }
}
