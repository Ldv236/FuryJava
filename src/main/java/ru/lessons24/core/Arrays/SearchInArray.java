package ru.lessons24.core.Arrays;

import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {

        int[] array = {4, 2, 9, 7, 3, 6};  // Неотсортированный массив
        System.out.println(Arrays.toString(array));
        int target = 7;  // Искомое значение

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Элемент найден на позиции: " + index);
        } else {
            System.out.println("Элемент не найден.");
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        index = binarySearch(array, target);
        if (index != -1) {
            System.out.println("Элемент найден на позиции: " + index);
        } else {
            System.out.println("Элемент не найден.");
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Возвращаем индекс, если нашли элемент
            }
        }
        return -1;  // Возвращаем -1, если элемент не найден
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;  // Элемент найден
            } else if (array[middle] < target) {
                left = middle + 1;  // Ищем в правой половине
            } else {
                right = middle - 1;  // Ищем в левой половине
            }
        }
        return -1;  // Элемент не найден
    }
}
