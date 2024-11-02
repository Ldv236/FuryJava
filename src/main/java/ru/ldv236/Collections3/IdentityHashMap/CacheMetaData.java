package ru.ldv236.Collections3.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class CacheMetaData {
    public static void main(String[] args) {
        // Пример 1: Кэширование метаданных
        Map<Object, Metadata> cache = new IdentityHashMap<>();
        Object obj1 = new Object();
        Object obj2 = new Object();

        // Добавляем метаданные для разных объектов
        cache.put(obj1, new Metadata());
        cache.put(obj2, new Metadata());

        // Даже если значения объектов одинаковы, они считаются разными
        System.out.println("Размер кэша: " + cache.size());  // Вывод: 2

        // Если другой объект с таким же значением будет добавлен, он не перезапишет существующий
        Object obj3 = obj1;
        cache.put(obj3, new Metadata());
        System.out.println("Размер кэша после добавления obj3: " + cache.size()); // Всё ещё 2, так как obj3 == obj1
    }

    private static class Metadata {
        // ...
    }
}
