package ru.ldv236.Collections3.IdentityHashMap;

import java.util.IdentityHashMap;

public class IdentityReferences {
    public static void main(String[] args) {
        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        String str1 = new String("key");
        String str2 = new String("key");

        map.put(str1, 1);
        map.put(str2, 2);

        System.out.println("Размер карты: " + map.size()); // Вывод: 2, так как str1 != str2
        System.out.println("Значение для str1: " + map.get(str1)); // Вывод: 1
        System.out.println("Значение для str2: " + map.get(str2)); // Вывод: 2
    }
}
