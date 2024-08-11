package ru.ldv236.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    void touchLinkedList() {

        LinkedList<String> animals = new LinkedList<>();

        // Добавление элементов
        animals.add("Dog");
        animals.addFirst("Cat"); // Добавляем элемент в начало списка
        animals.addLast("Horse"); // Добавляем элемент в конец списка
        animals.add(1, "Rabbit"); // Вставляем элемент по индексу

        System.out.println("LinkedList: " + animals);

        // Удаление первого и последнего элемента
        animals.removeFirst();
        animals.removeLast();

        // Удаление элемента по индексу
        animals.remove(0);

        // Удаление конкретного элемента
        animals.remove("Dog");

        System.out.println("LinkedList после удаления: " + animals);

        //Разные варианты инициализации списка

//        List<String> arrayListAnimals = new ArrayList<>();
//        Collections.addAll(arrayListAnimals, "Слон", "Верблюд", "Лама");

        ArrayList<String> arrayListAnimals = new ArrayList<>(List.of("Заяц", "Кролик", "Свинья"));

// ArrayList<String> arrayListAnimals = new ArrayList<>(Arrays.asList("Бык", "Сова", "Капибара"));

        //Добавление всего списка в линкедЛист
        animals.addAll(arrayListAnimals);
        System.out.println(animals);

        // Получение первого и последнего элемента
        System.out.println("Первый элемент: " + animals.getFirst());
        System.out.println("Последний элемент: " + animals.getLast());

        //использование for-each цикла
        System.out.print("for-each:");
        for (String animal : animals) {
            System.out.print(" " + animal);
        }
        System.out.println();

        //использование итератора
        Iterator<String> iterator = animals.iterator();
        System.out.print("итератор:");
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.print(" " + animal);
        }
        System.out.println();

        List<String> linkedList = new LinkedList<>(List.of("Element1", "Element2", "Element3"));
        for (int i = 0; i < linkedList.size(); i++) {
            String currentElement = linkedList.get(i);
            linkedList.set(i, currentElement + "!!!");
        }
        System.out.println(linkedList);
    }
}
