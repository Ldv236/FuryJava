package ru.ldv236.CollectionsOld;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    void touchSet() {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Pineapple");
        hashSet.add("Orange");
        hashSet.add("Orange");
        hashSet.add("Orange");

        System.out.println("HashSet: " + hashSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Pineapple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Orange");

        System.out.println("LinkedHashSet: " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Pineapple");
        treeSet.add("Orange");
        treeSet.add("Orange");
        treeSet.add("Orange");

        System.out.println("TreeSet: " + treeSet);

        // Удаление конкретного элемента
        hashSet.remove("Banana");
        System.out.println("HashSet после удаления Banana: " + hashSet);

        // Проверка наличия элемента
        boolean hasApple = hashSet.contains("Apple");
        System.out.println("Содержит ли HashSet Apple - " + hasApple);

        // Попытка добавить дубликат
        boolean isAdded = hashSet.add("Apple");
        System.out.println("Был ли добавлен дубликат Apple - " + isAdded);

        //итерация по HashSet
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Получение размера HashSet
        int size = hashSet.size();
        System.out.println("Размер HashSet: " + size);

        // Удаление всех элементов
        hashSet.clear();
        System.out.println("HashSet после удаления всех элементов: " + hashSet);

//        Set<Person> treeSetPerson = new TreeSet<>();
        Set<Person> treeSetPerson = new TreeSet<>(new PersonComparator());
        treeSetPerson.add(new Person("Boris", 23));
        treeSetPerson.add(new Person("Cristina", 25));
        treeSetPerson.add(new Person("Anna", 25));
        treeSetPerson.add(new Person("Anna", 20));
        treeSetPerson.add(new Person("Anna", 20));

        System.out.println("TreeSetPerson: " + treeSetPerson);

        Set<Person> treeSetPerson2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
    }
}
