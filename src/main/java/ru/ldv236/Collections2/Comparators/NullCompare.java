package ru.ldv236.Collections2.Comparators;

import java.util.*;

public class NullCompare {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add(null);

        Collections.sort(list1); // NPE
        System.out.println(list1);

//        1. Удалить null перед сортировкой
//        Если null в списке не нужен:

        list1.removeIf(Objects::isNull);
        Collections.sort(list1);
        System.out.println(list1); // [A, B, C]

//        2. Использовать пользовательский Comparator
//        Создайте Comparator, который явно определяет порядок для null:

        list1.sort(Comparator.nullsFirst(String::compareTo)); // Null в начале
        // Или
        list1.sort(Comparator.nullsLast(String::compareTo)); // Null в конце
        System.out.println(list1); // [null, A, B, C] или [A, B, C, null]
    }
}
