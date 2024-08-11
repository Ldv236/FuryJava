package ru.ldv236.collections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CompareDifferentLists {

    //для отслеживания роста внутреннего массива в АррейЛисте
    static int currentCapacity = 0;
    static boolean checkCapacityFlag = false;

    public void compareLists() {

        // Сравнение быстродействия листов
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тестируем ArrayList
        System.out.println("ArrayList performance:");
        testListPerformance(arrayList);

        // Тестируем LinkedList
        System.out.println("\nLinkedList performance:");
        testListPerformance(linkedList);
    }


    public static void testListPerformance(List<Integer> list) {

        //измерение времени добавления элементов
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            //если на итерации капасити изменилась, то смотрим параметры листа
            if (list instanceof ArrayList && checkCapacityFlag) {
                if (currentCapacity != getCapacity(list)) {
                    currentCapacity = getCapacity(list);
                    checkCapacity(list);
                }
            }
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to add 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени добавления элементов в начало
        list.clear();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to add in start 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени доступа к элементам по индексу
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to get by index 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени доступа к элементам по итератору
        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to get by iterator 100,000 elements: " + (endTime - startTime) + " ms");

        //измерение времени удаления элементов (с конца для оптимизации LinkedList)
        startTime = System.currentTimeMillis();
        for (int i = 99999; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to remove 100,000 elements: " + (endTime - startTime) + " ms");
    }

    //показываем параметры листа (запускать в момент увеличения емкости)
    static void checkCapacity(List list) {
        int capacity = getCapacity(list);
        double percent = Math.round((double) capacity / (double) (list.size() - 1) * 100);
        System.out.println("List size before increase - " + (list.size() - 1) + ", new capacity: " + capacity + " - " + percent + "% by old capacity value");
    }

    //с помощью рефлексии получаем капасити эррейЛиста (в параметрах запуска надо добавить в VM options "--add-opens java.base/java.util=ALL-UNNAMED")
    static Integer getCapacity(List list) {
        try {
            Field field = ArrayList.class.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] elementData = (Object[]) field.get(list);
            return elementData.length;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
