package ru.lessons24.Collections2.SetImplementations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // показать в том числе конструкторы с параметрами, объяснить капасити и лодфактор
        // Создание Set для хранения имён
        Set<String> nameSet = new HashSet<>();
//        Set<String> nameSet = new LinkedHashSet<>();
//        Set<String> nameSet = new TreeSet<>();

        // 1. Добавление имён (add)
        nameSet.add("John");
        nameSet.add("Alice");
        nameSet.add("Bob");
        nameSet.add("Diana");
        System.out.println("После добавления имён: " + nameSet);

        // 2. Добавление дубликатов (HashSet не допускает дубликаты)
        boolean addedDuplicate = nameSet.add("John");
        System.out.println("Добавление дубликата 'John': " + addedDuplicate); // false
        System.out.println("После попытки добавить дубликат: " + nameSet);

        // 3. Удаление элемента по имени (remove)
        nameSet.remove("Bob");
        System.out.println("После удаления 'Bob': " + nameSet);

        // 4. Проверка наличия имени (contains)
        boolean hasAlice = nameSet.contains("Alice");
        System.out.println("Содержит ли 'Alice'? " + hasAlice);

        // 5. Получение размера множества (size)
        int size = nameSet.size();
        System.out.println("Размер множества: " + size);

        // 6. Проверка пустого множества (isEmpty)
        boolean isEmpty = nameSet.isEmpty();
        System.out.println("Множество пусто? " + isEmpty);

        // 7. Итерация по именам (for-each loop)
        System.out.println("\nИмена в HashSet:");
        for (String name : nameSet) {
            System.out.println(name);
        }

        // 8. Очистка множества (clear)
        nameSet.clear();
        System.out.println("После очистки: " + nameSet);

        // 9. Добавление новых имён для демонстрации операций с множествами
        nameSet.add("Michael");
        nameSet.add("Sarah");
        nameSet.add("David");

        Set<String> anotherNamesSet = new HashSet<>();
        anotherNamesSet.add("David");
        anotherNamesSet.add("Emily");
        anotherNamesSet.add("Sarah");

        // 10. Объединение множеств (addAll)
        Set<String> unionSet = new HashSet<>(nameSet);
        unionSet.addAll(anotherNamesSet);
        System.out.println("\nОбъединение множеств (nameSet + anotherNamesSet): " + unionSet);

        // 11. Пересечение множеств (retainAll)
        Set<String> intersectionSet = new HashSet<>(nameSet);
        intersectionSet.retainAll(anotherNamesSet);
        System.out.println("Пересечение множеств (nameSet ∩ anotherNamesSet): " + intersectionSet);

        // 12. Разность множеств (removeAll)
        Set<String> differenceSet = new HashSet<>(nameSet);
        differenceSet.removeAll(anotherNamesSet);
        System.out.println("Разность множеств (nameSet - anotherNamesSet): " + differenceSet);
    }
}
