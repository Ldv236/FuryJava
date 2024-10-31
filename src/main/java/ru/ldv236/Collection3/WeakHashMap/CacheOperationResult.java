package ru.ldv236.Collection3.WeakHashMap;


import java.util.Map;
import java.util.WeakHashMap;

public class CacheOperationResult {
    public static void main(String[] args) {
        Map<Object, Integer> calculationCache = new WeakHashMap<>();
        Object obj = new Object();

        // Сохраняем результат вычисления
        calculationCache.put(obj, ExpensiveCalculation.calculate(obj));

        System.out.println("Кэш содержит результат: " + calculationCache.containsKey(obj)); // true

        // Удаляем сильную ссылку на obj, оставляя только слабую
        obj = null;

        // Принудительный вызов сборщика мусора
        System.gc();

        // Даем время на выполнение GC
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // После выполнения GC объект удален, и запись должна исчезнуть
        System.out.println("Размер кэша после GC: " + calculationCache.size()); // Вывод: 0, если obj собран
    }

    static class ExpensiveCalculation {
        static int calculate(Object key) {
            // Имитация дорогостоящего вычисления
            return key.hashCode();
        }
    }
}
