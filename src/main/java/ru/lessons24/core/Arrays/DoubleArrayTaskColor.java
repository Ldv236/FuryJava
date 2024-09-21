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

        int sr = 1, sc = 1; // Начальная позиция (строка 1, столбец 1)
        int newColor = 2;   // Новый цвет

        floodFill(image, sr, sc, newColor);

        // Вывод измененного изображения
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    public static void floodFill(int[][] image, int sr, int sc, int newColor) {
        int currentColor = image[sr][sc];
        // Если цвет уже совпадает с новым, ничего не делаем
        if (currentColor != newColor) {
            dfs(image, sr, sc, currentColor, newColor);
        }
    }

    private static void dfs(int[][] image, int i, int j, int currentColor, int newColor) {
        // Проверка выхода за пределы массива или если цвет не совпадает
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != currentColor) {
            return;
        }

        // Меняем цвет текущей ячейки
        image[i][j] = newColor;

        // Рекурсивно вызываем dfs для соседних ячеек (вверх, вниз, влево, вправо)
        dfs(image, i - 1, j, currentColor, newColor); // Вверх
        dfs(image, i + 1, j, currentColor, newColor); // Вниз
        dfs(image, i, j - 1, currentColor, newColor); // Влево
        dfs(image, i, j + 1, currentColor, newColor); // Вправо
    }
}
