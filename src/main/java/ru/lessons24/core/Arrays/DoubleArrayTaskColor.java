package ru.lessons24.core.Arrays;

public class DoubleArrayTaskColor {
//    Для задачи "раскрашивания участка изображения" (аналог Flood Fill) можно использовать
//    схожий подход с рекурсивным обходом (DFS), как и в задаче про подсчет островов.
//    Основная идея заключается в том, чтобы начать с выбранной позиции в 2D-матрице,
//    которая представляет изображение, и заменить все соседние клетки с тем же значением на новый цвет.
//    Этот алгоритм работает только в направлении по горизонтали и вертикали.
//
//    Алгоритм:
//    Мы начнем с заданной позиции и запомним исходное значение (цвет) этой клетки.
//    Затем рекурсивно будем искать все соседние клетки, которые имеют то же значение (цвет), и менять их на новый цвет.
//    Используем DFS для обхода по четырем направлениям (вверх, вниз, влево, вправо).
//
//    Время: O(m * n), где m — количество строк, а n — количество столбцов,
//    потому что в худшем случае мы можем посетить все ячейки.
//    Пространство: O(m * n) — глубина стека вызовов рекурсии в худшем случае.

    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int startRow = 1, startColumn = 1; // Начальная позиция (строка 1, столбец 1)
        int newColor = 2;   // Новый цвет

        floodFill(image, startRow, startColumn, newColor);

        // Вывод измененного изображения
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public static void floodFill(int[][] image, int startRow, int startColumn, int newColor) {
        int currentColor = image[startRow][startColumn];
        // Если цвет уже совпадает с новым, ничего не делаем
        if (currentColor != newColor) {
            dfs(image, startRow, startColumn, currentColor, newColor);
        }
    }

    private static void dfs(int[][] image, int row, int column, int currentColor, int newColor) {
        // Проверка выхода за пределы массива или если цвет не совпадает
        if (row < 0 || row >= image.length ||
                column < 0 || column >= image[0].length ||
                image[row][column] != currentColor) {
            return;
        }

        // Меняем цвет текущей ячейки
        image[row][column] = newColor;

        // Рекурсивно вызываем dfs для соседних ячеек (вверх, вниз, влево, вправо)
        dfs(image, row - 1, column, currentColor, newColor); // Вверх
        dfs(image, row + 1, column, currentColor, newColor); // Вниз
        dfs(image, row, column - 1, currentColor, newColor); // Влево
        dfs(image, row, column + 1, currentColor, newColor); // Вправо
    }
}
