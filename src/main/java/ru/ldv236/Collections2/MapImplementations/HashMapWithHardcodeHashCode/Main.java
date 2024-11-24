package ru.ldv236.Collections2.MapImplementations.HashMapWithHardcodeHashCode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<KeyForMap, String> map = new HashMap<>();

        map.put(new KeyForMap(0, "Kolya"), "String1");
        map.put(new KeyForMap(16, "Sasha"), "String1");

        map.put(new KeyForMap(1, "Dima"), "String1");
        map.put(new KeyForMap(1, "Ivan"), "String1");
        map.put(new KeyForMap(1, "Masha"), "String1");
        map.put(new KeyForMap(17, "Igor"), "String1");

        map.put(new KeyForMap(15, "Dasha"), "String1");
        map.put(new KeyForMap(31, "Dasha"), "String1");
        map.put(new KeyForMap(47, "Dasha"), "String1");

        map.put(new KeyForMap(62, "Dasha"), "String1");

        map.forEach((k, v) -> System.out.println(k + ": " + v));


        // пример без дополнительных объектов для ключей
        Map<Integer, String> map2 = new HashMap<>(16, 0.75f);
        map2.put(1, "one"); // 1 % 16 = 1
        map2.put(2, "two"); // 2 % 16 = 2
        map2.put(3, "three");
        map2.put(4, "four");
        map2.put(5, "five");
        map2.put(6, "six");
        map2.put(7, "seven");
        map2.put(8, "eight");
        map2.put(9, "nine");
        map2.put(10, "ten"); // когда в мапе 13 элементов
        /// 11-16
        map2.put(11, "eleven");
        map2.put(12, "twelve");
        map2.put(13, "thirteen");
        map2.put(14, "fourteen");
        map2.put(15, "fifteen");
        map2.put(16, "sixteen");
        /// повтор бакетов (до перестройки на 32)
        map2.put(17, "seventeen"); // 17 % 16 = 1 // 17 % 32 = 17
        map2.put(18, "eighteen"); // 18 % 16 = 2  // 18 % 32 = 18
        map2.put(19, "nineteen");
        System.out.println(map2);
    }
}
