package ru.ldv236.lambda;

import ru.ldv236.collections.Person;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Person> treeSetPerson = new TreeSet<>(new PersonComparator());
//        Set<Person> treeSetPerson = new TreeSet<>(new Comparator<Person>() {
//            @Override
//            public int compare(Person p1, Person p2) {
//                return p2.getName().compareTo(p1.getName());
//            }
//        });

        Set<Person> treeSetPerson = new TreeSet<>((Person p1, Person p2) -> {return p2.getName().compareTo(p1.getName());});

        treeSetPerson.add(new Person("Boris", 23));
        treeSetPerson.add(new Person("Cristina", 25));
        treeSetPerson.add(new Person("Anna", 25));

        System.out.println("TreeSetPerson: " + treeSetPerson);


    }
}
