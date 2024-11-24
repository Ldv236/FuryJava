package ru.ldv236.Collections2.MapImplementations.HashMapWithHardcodeHashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonMapCollision {
    public static void main(String[] args) {

        HashMap<Person, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        map.put(new Person(1), null);
        map.put(new Person(2), 2);
        map.put(new Person(3), 3);
        map.put(new Person(4), 4);
        map.put(new Person(5), 5);
        map.put(new Person(6), 6);
        map.put(new Person(7), 7);
        map.put(new Person(8), 8);
        map.put(new Person(9), 9);
        map.put(new Person(10), 10);
        map.put(new Person(11), 11);
        map.put(new Person(12), 12);
        map.put(new Person(13), 13);
        map.put(new Person(14), 14);
        map.put(new Person(15), 15);
        map.put(new Person(16), 16);
        map.put(new Person(17), 17);

        System.out.println(map);
    }
}
