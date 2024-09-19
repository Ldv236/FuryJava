package ru.lessons24.Collections2.Comparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ListSorting {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Dmitry", 35);
        Person person2 = new Person("Elena", 35);
        Person person3 = new Person("Anna.", 37);
        Person person4 = new Person("Boris", 36);
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        Scanner sc = new Scanner(System.in);
        Comparator<Person> personAgeComparator;
        System.out.println("Введите число от 1 до 5");
        while (true) {
            personAgeComparator =
                    switch (sc.nextInt()) {
                        case 1 -> new PersonAgeComparator();
                        case 2 -> new PersonAgeReverseComparator();
                        case 3 -> new PersonNameComparator();
                        case 4 -> new PersonNameReverseComparator();
                        case 5 -> new PersonAgeNameComparator();
                        default -> null;
                    };

            if (personAgeComparator == null) {
                System.out.println("Не задан порядок сортировки! Введите число от 1 до 5");
                continue;
            }
            personList.sort(personAgeComparator);
            System.out.print(personList);
            System.out.println();
        }
    }
}
