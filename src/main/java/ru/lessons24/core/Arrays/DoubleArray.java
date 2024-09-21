package ru.lessons24.core.Arrays;

public class DoubleArray {
    public static void main(String[] args) {

        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            java.util.Arrays.fill(matrix[i], i + 1); // Заполняем каждую строку матрицы одинаковым значением
        }
        System.out.println("Многомерный массив:");
        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }


        // Создаем двумерный массив размером 2x4
        int[][] array = new int[2][4];

        // Переменная для заполнения массива числами от 1 до 8
        int value = 1;

        // Заполнение массива
        for (int i = 0; i < array.length; i++) {        // Внешний цикл по строкам
            for (int j = 0; j < array[i].length; j++) { // Внутренний цикл по столбцам
                array[i][j] = value;
                value++;
            }
        }

        // Вывод двумерного массива на экран
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }
    }
}
