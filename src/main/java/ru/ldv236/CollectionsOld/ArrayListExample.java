package ru.ldv236.CollectionsOld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    static List<String> fruits = new ArrayList<>();

    void touchArrayList() {

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Pine");
        fruits.add("Melon");
        System.out.println("Initial list: " + fruits);

        // Удаление по индексу
        fruits.remove(1); // Удаляет "Banana"
        System.out.println("After removing by index: " + fruits);

        // Удаление по объекту
        fruits.remove("Cherry");
        System.out.println("After removing an object: " + fruits);

        // Проверка на наличие элемента
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Contains Apple? " + hasApple);

        // Получение индекса элемента
        int appleIndex = fruits.indexOf("Apple");
        System.out.println("Index of Apple: " + appleIndex);

        // Замена элемента на новый
        fruits.set(0, "Peach");
        System.out.println("After replacing an element: " + fruits);

        System.out.print("print with for-cycle:");
        for (String fruit : fruits) {
            System.out.print(" " + fruit);
//            fruits.set(fruits.indexOf(fruit), "otherFruit");
            if ("Pine".equals(fruit)) {
//                fruits.remove(fruit);
                System.out.print("[remove " + fruits.get(0) + "]");
                fruits.remove(0);
//                fruits.add("afterPine");
//                System.out.print("[remove " + fruit + "]");
            }
        }
        System.out.println();

        System.out.print("print with iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(" " + fruit);

            if ("Melon".equals(fruit)) {
//            if (fruit.length() < 5) {
                iterator.remove();
                System.out.print("[remove " + fruit + "]");
            }
        }
        System.out.println();
        System.out.println("List after removal: " + fruits);

        // Создание подсписка
        //ArrayList<String> subList = new ArrayList<>(fruits.subList(1, 5));
        ArrayList<String> subList = new ArrayList<>(fruits.subList(1, Math.min(5, fruits.size())));
        System.out.println("Sublist: " + subList);

        //преобразование в массив
        String[] fruitsArray = new String[fruits.size()];
        fruits.toArray(fruitsArray);
        for (String fruit : fruitsArray) {
            System.out.println("Array element: " + fruit);
        }
    }

    void doAnythingWithSublist() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        System.out.println("Original list: " + list);

        // Индексы для удаления
        int start = 5;
        int end = 15;

        // делаем всякое с подсписком в указанном диапазоне
//        list.subList(start, end).clear();
//        list.subList(start, end).replaceAll(i -> i * 2);
//        list.subList(start, end).removeIf(i -> i % 2 == 0);
        list.subList(start, end).sort((i1, i2) -> Integer.compare(i2, i1));

        System.out.println("List after removal: " + list);
    }
}
