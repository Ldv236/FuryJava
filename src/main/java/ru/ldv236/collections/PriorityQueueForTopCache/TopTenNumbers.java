package ru.ldv236.collections.PriorityQueueForTopCache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopTenNumbers {

    // Поле для хранения минимальной кучи с размером не более 10
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>(10);

    /**
     * Метод для добавления нового числа в поток данных.
     * @param number входное число, которое нужно учесть.
     */
    public void addNumber(int number) {
        // Если размер кучи меньше 10, добавляем элемент
        if (minHeap.size() < 10) {
            minHeap.offer(number);
        } else {
            // Если новый элемент больше минимального в куче, заменяем минимальный элемент
            if (number > minHeap.peek()) {
                minHeap.poll();  // Удаляем минимальный элемент
                minHeap.offer(number);  // Добавляем новый элемент
            }
        }
//        В любом случае, структура хранит только 10 элементов, что минимизирует потребление памяти.
//        Добавление нового элемента в кучу и удаление минимального элемента выполняется
//        за логарифмическое время O(log 10), что практически константа.
//        Общая производительность метода addNumber составляет O(log 10),
//        а получение топ-10 элементов — O(n log n), где n — количество элементов в куче (в данном случае, n = 10).
    }

    /**
     * Метод для получения текущих 10 максимальных чисел.
     * @return список из 10 максимальных чисел в порядке убывания.
     */
    public List<Integer> getTopTen() {
        // Создаём список для сортировки и вывода 10 максимальных элементов
        List<Integer> topTenList = new ArrayList<>(minHeap);
        // Сортируем в порядке убывания
        topTenList.sort(Collections.reverseOrder());
        return topTenList;
    }
}
