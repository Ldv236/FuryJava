package ru.tasks.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval57 {
    public static void main(String[] args) {
        int[][] res = insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;

        // Добавляем все интервалы, заканчивающиеся до начала нового интервала
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        // Слияние всех перекрывающихся интервалов в новый интервал
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        // Добавляем объединенный новый интервал
        result.add(newInterval);

        // Добавляем остальные интервалы
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        // Преобразовываем список обратно в массив для возврата
        return result.toArray(new int[result.size()][2]);
    }
}
