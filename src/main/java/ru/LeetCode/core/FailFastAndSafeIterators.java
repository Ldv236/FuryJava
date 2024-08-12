package ru.LeetCode.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndSafeIterators {
    public static void main(String[] args) {

        // Создание ArrayList целых чисел
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Добавление элементов в список
        list.add(1452);
        list.add(6854);
        list.add(8741);

        // Получение итератора из списка
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer integer = (Integer) it.next();
            // Это вызовет исключение
            // ConcurrentModificationException
            list.add(8457);
        }
    }
}

class FailFastAndSafeIterators2 {
    public static void main(String[] args) {

        // Создание ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map =
                new ConcurrentHashMap<String, Integer>();

        // Добавляем элементы на карту
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);

        // Получение итератора из карты
        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key+" : "+map.get(key));
            // Это не будет отражено в Iterator
            map.put("FOUR", 4);
        }
    }
}
