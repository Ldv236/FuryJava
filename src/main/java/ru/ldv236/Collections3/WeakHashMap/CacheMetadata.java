package ru.ldv236.Collections3.WeakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class CacheMetadata {
    public static void main(String[] args) {
        Map<Object, Metadata> cache = new WeakHashMap<>();
        Object key1 = new Object();
        Object key2 = new Object();

        // Добавляем метаданные для key1 и key2
        cache.put(key1, new Metadata());
        cache.put(key2, new Metadata());

        System.out.println("Размер кэша до GC: " + cache.size()); // Вывод: 2

        // Убираем сильную ссылку на key1
        key1 = null;

        // Принудительно запускаем сборщик мусора
        System.gc();

        // Ожидаем, что слабая ссылка на key1 будет собрана и удалена из WeakHashMap
        try {
            Thread.sleep(100); // Даем время сборщику мусора
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Размер кэша после GC: " + cache.size()); // Вывод: 1, если key1 был собран
    }

    static class Metadata {
    }
}
