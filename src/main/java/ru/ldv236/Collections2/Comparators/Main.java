package ru.ldv236.Collections2.Comparators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Почему нельзхя менять элементы сета (и также ключи мапы) - после изменения они просто не находятся,
        // т.к. изменился хэш-код, удалиться тоже не сможет (в триСете вероятность меньше, но тоже лажа)
        Set<Person> persons = new TreeSet<>();
        // типа то же самое, как и с натуральным порядком
//        Set<Person> persons = new TreeSet<>(new PersonNameComparator());
        // то же, но в обратном порядке
//        Set<Person> persons = new TreeSet<>(new PersonNameReverseComparator());
        // ебучие глаза! Лена потерялясь из-за повтора года! еще и контейнс показывает тру для любого человека 35-лет
//        Set<Person> persons = new TreeSet<>(new PersonAgeComparator());
//        Set<Person> persons = new TreeSet<>(new PersonAgeReverseComparator());
//        Set<Person> persons = new TreeSet<>(new PersonAgeNameComparator());

        Person person1 = new Person("B. Dmitry", 35);
        Person person2 = new Person("A. Elena", 35);
        Person person3 = new Person("Y. Anna.", 37);
        Person person4 = new Person("D. Boris", 36);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        System.out.println("\nИсходный сет");
        System.out.println(persons);

//         это уже после компараторов
        findPerson(persons, person1, person2, person3, person4);

        person1.setName("Dmitry");
        person2.setName("Elena");
        person3.setName("Anna");
        person4.setName("Boris");
        System.out.println("\nПосле изменения объектов, которые уже лежали в сете");
        System.out.println(persons);
        findPerson(persons, person1, person2, person3, person4);
        persons.remove(person1);
        persons.remove(person2);
        persons.remove(person3);
        persons.remove(person4);
        System.out.println("\nПосле удаления - какие элементы остались");
        System.out.println(persons);

        persons.clear();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        System.out.println("\nПосле очистки сета и добавления заново объектов с измененным состоянием");
        System.out.println(persons);
        findPerson(persons, person1, person2, person3, person4);
    }

    static void findPerson(Set<Person> personSet, Person... people) {
        for (Person person : people) {
            System.out.println("поиск в сете - " + person + " - " + personSet.contains(person));
        }
    }
}
