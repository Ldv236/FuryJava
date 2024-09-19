package ru.lessons24.Collections1.DateTimes;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Сравнение быстродействия листов
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("ArrayList - добавление в конец: " + addInEnd(arrayList));
        System.out.println("LinkedList - добавление в конец: " + addInEnd(linkedList));
        System.out.println("***");

        System.out.println("ArrayList - добавление в начало: " + addInStart(arrayList));
        System.out.println("LinkedList - добавление в начало: " + addInStart(linkedList));
        System.out.println("***");

        System.out.println("ArrayList - добавление в середину: " + addInMiddle(arrayList));
        System.out.println("LinkedList - добавление в середину: " + addInMiddle(linkedList));
        System.out.println("***");

        System.out.println("ArrayList - получение с get: " + getByIndex(arrayList));
        System.out.println("LinkedList - получение с get: " + getByIndex(linkedList));
        System.out.println("***");

        System.out.println("ArrayList - получение итератором: " + getByIterator(arrayList));
        System.out.println("LinkedList - получение итератором: " + getByIterator(linkedList));
        System.out.println("***");
    }


    public static long addInEnd(List<Integer> list) {
        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < 50_000; i++) {
            list.add(i);
        }
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        list.clear();
        return time.toMillis();
    }


    public static long addInStart(List<Integer> list) {
        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < 50_000; i++) {
            list.add(0, i);
        }
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        list.clear();
        return time.toMillis();
    }

    public static long addInMiddle(List<Integer> list) {
        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < 50_000; i++) {
            list.add(list.size() / 2, i);
        }
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        return time.toMillis();
    }

    public static long getByIndex(List<Integer> list) {
        LocalTime startTime = LocalTime.now();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        return time.toMillis();
    }


    public static long getByIterator(List<Integer> list) {
        LocalTime startTime = LocalTime.now();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        LocalTime endTime = LocalTime.now();
        Duration time = Duration.between(startTime, endTime);
        return time.toMillis();
    }
}
