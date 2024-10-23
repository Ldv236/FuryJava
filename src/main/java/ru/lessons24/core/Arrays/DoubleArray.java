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

        int[][] forSum = {
                {1, 2, 3},
                {4, 5, 6}
        };
        sumOfLines(forSum);
        sumOfColumns(forSum);
    }
    static void sumOfLines(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int sumLines = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumLines += array[i][j];
            }
            System.out.println("Сумма " + (i + 1) + " строки равна: " + sumLines);
        }
    }

    /** Находит сумму чисел в столбцах матрицы
     *
     * @param array двумерный массив для подсчета
     */
    static void sumOfColumns(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            int sumColumns = 0;
            for (int j = 0; j < array.length; j++) {
                sumColumns += array[j][i];
            }
            System.out.println("Сумма " + (i + 1) + " столбца равна: " + sumColumns);
        }
    }
}
