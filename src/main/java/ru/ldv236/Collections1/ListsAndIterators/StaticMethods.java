package ru.ldv236.Collections1.ListsAndIterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StaticMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);
        System.out.println("Исходный список " + list);

        Collections.sort(list);
        System.out.println("Сортированный список " + list);

        Collections.shuffle(list);
        System.out.println("Перемешанный список " + list);

        Collections.reverse(list);
        System.out.println("Обратный список " + list);

        Collections.fill(list, 5);
        System.out.println("Заполненный список " + list);

    }
}
