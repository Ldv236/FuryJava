package ru.ldv236.CollectionsOld.HashMapWithHardcodeHashCode;

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
    }
}
