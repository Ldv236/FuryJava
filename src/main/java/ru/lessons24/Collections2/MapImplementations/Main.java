package ru.lessons24.Collections2.MapImplementations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        // Создание HashMap
//        Map<String, Integer> fruitMap = new HashMap<>();
//        Map<String, Integer> fruitMap = new LinkedHashMap<>();
        Map<String, Integer> fruitMap = new TreeMap<>();

        // 1. Вставка элементов (put)
        fruitMap.put("Banana", 15);
        fruitMap.put("Apple", 10);
        fruitMap.put("Orange", 20);
        System.out.println("После вставки: " + fruitMap);

        // 2. Обновление значения для существующего ключа (put)
        fruitMap.put("Apple", 30);  // Обновляем значение для "Apple"
        System.out.println("После обновления 'Apple': " + fruitMap);

        // 3. Вставка с проверкой, если ключ отсутствует (putIfAbsent)
        fruitMap.putIfAbsent("Grapes", 25);
        System.out.println("После putIfAbsent 'Grapes': " + fruitMap);

        // 4. Удаление элемента по ключу (remove)
        fruitMap.remove("Banana");
        System.out.println("После удаления 'Banana': " + fruitMap);

        // 5. Удаление по ключу и значению (remove)
        boolean removed = fruitMap.remove("Orange", 20);
        System.out.println("Удаление 'Orange' с проверкой значения: " + removed);
        System.out.println("После удаления 'Orange': " + fruitMap);

        // 6. Получение значения по ключу (get)
        int appleCount = fruitMap.get("Apple");
        System.out.println("Значение для 'Apple': " + appleCount);

        // 7. Получение значения по несуществующему ключу (getOrDefault)
        int mangoCount = fruitMap.getOrDefault("Mango", -1);
        System.out.println("Значение для 'Mango' (по умолчанию -1): " + mangoCount);

        // 8. Проверка наличия ключа (containsKey)
        boolean hasApple = fruitMap.containsKey("Apple");
        System.out.println("Содержит ли ключ 'Apple'? " + hasApple);

        // 9. Проверка наличия значения (containsValue)
        boolean hasValue10 = fruitMap.containsValue(10);
        System.out.println("Содержит ли значение 10? " + hasValue10);

        // 10. Получение размера HashMap (size)
        int size = fruitMap.size();
        System.out.println("Размер HashMap: " + size);

        // 11. Очистка всех элементов (clear)
        fruitMap.clear();
        System.out.println("После очистки: " + fruitMap);

        // 12. Вставка нескольких элементов для демонстрации итерации
        fruitMap.put("Pineapple", 5);
        fruitMap.put("Watermelon", 8);
        fruitMap.put("Strawberry", 12);

        // 13. Итерация по ключам (keySet)
        System.out.println("\nИтерация по ключам:");
        for (String key : fruitMap.keySet()) {
            System.out.println("Ключ: " + key);
        }

        // 14. Итерация по значениям (values)
        System.out.println("\nИтерация по значениям:");
        for (Integer value : fruitMap.values()) {
            System.out.println("Значение: " + value);
        }

        // 15. Итерация по ключам и значениям (entrySet)
        System.out.println("\nИтерация по парам ключ-значение:");
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }

        // 16. Копирование всех элементов из одной карты в другую (putAll)
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Lemon", 7);
        anotherMap.put("Peach", 6);

        fruitMap.putAll(anotherMap);
        System.out.println("\nПосле копирования из anotherMap: " + fruitMap);
    }
}
