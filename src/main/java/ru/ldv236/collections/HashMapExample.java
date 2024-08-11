package ru.ldv236.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    void touchHashMap() {
        Map<String, Integer> map = new HashMap<>();

        // Добавление элементов
        map.put("понедельник", 1);
        map.put("вторник", 2);
        map.put("среда", 3);

        System.out.println("Initial map: " + map);

        Map<String, Integer> LinkedMap = new LinkedHashMap<>();

        // Добавление элементов
        LinkedMap.put("понедельник", 1);
        LinkedMap.put("вторник", 2);
        LinkedMap.put("среда", 3);

        System.out.println("Initial LinkedMap: " + LinkedMap);

        // Обновление значения по ключу
        map.put("понедельник", 4); // Если ключ уже существует, обновляется его значение

        // Получение значения по ключу
        Integer appleCount = map.get("понедельник");
        System.out.println("понедельник: " + appleCount);

        // Получение значения с default
        Integer orangeCount = map.getOrDefault("четверг", 99);
        System.out.println("четверг: " + orangeCount);

        // Удаление элемента по ключу
        map.remove("среда");

        // Удаление элемента по ключу, только если его значение совпадает с указанным
        map.remove("вторник", 3);

        System.out.println("Map after removals: " + map);

        // Получение набора Entry (ключ-значение)
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Получение Set ключей
        System.out.println("Keys: " + map.keySet());

        // Получение Collection значений
        System.out.println("Values: " + map.values());

        //итерация по ключам и доступ к значениям
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("пара: " + key + ", " + value);
        }
    }
}
