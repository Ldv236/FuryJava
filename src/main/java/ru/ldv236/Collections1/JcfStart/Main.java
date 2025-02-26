package ru.ldv236.Collections1.JcfStart;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        // Создание списка
        Collection<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        // Вывод элементов
        System.out.println("Изначальный список: " + names);

        names.addAll(names);
        System.out.println("С добавленными элементами addAll: " + names);

        names.remove("Charlie");
        System.out.println("После удаления: " + names);
        names.remove("Charlie");
        System.out.println("После удаления еще раз: " + names);

        boolean isContainName = names.contains("Bob");
        System.out.println("Есть ли в коллекции Боб - " + isContainName);

        System.out.println("Пуста ли коллекция - " + names.isEmpty());
        System.out.println("Размер коллекции - " + names.size());
        names.clear();
        System.out.println("Пуста ли коллекция - " + names.isEmpty());

        isContainName = names.contains("Bob");
        System.out.println("Есть ли в коллекции Боб - " + isContainName);

        // Перебор с помощью цикла for-each
//        for (String name : names) {
//            System.out.println("Имя: " + name);
//        }

        Boolean source = false;
        boolean target = false;
        System.out.println(source == target);
    }
}
