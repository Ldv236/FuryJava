package ru.ldv236.Collections2.streamApiOld;

import java.util.*;
import java.util.stream.Collectors;

public class StreamWithPersons {
    void doStream () {
        List<Person> people = Arrays.asList(
                new Person("Frank", 28),
                new Person("Alice", 32),
                new Person("Bob", 24),
                new Person("Charlie", 32),
                new Person("David", 28),
                new Person("Elizabeth", 24),
                new Person("Gina", 24),
                new Person("Gina", 23)
        );

        List<Person> olderThan25 = people.stream()
                .filter(person -> person.getAge() > 25)
                .collect(Collectors.toList());
        System.out.println("People older than 25: " + olderThan25);

        Map<String, Integer> peopleMap = people.stream().collect(Collectors.toMap(
                Person::getName,
                Person::getAge,
//                (p1, p2) -> null, //repeatable key -> entry be null, wow
                (p1, p2) -> p2, //repeatable key -> second (new) entry save
//                TreeMap::new //natural order for
                LinkedHashMap::new //insert order for
        ));
        System.out.println("peopleMap - " + peopleMap);




        List<String> names = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Names: " + names);



        //Допустим, у нас есть список списков строк, и мы хотим получить все строки в одном списке:
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David"),
                Arrays.asList("Elizabeth", "Frank", "Gina")
        );

        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flat list: " + flatList);



        List<Person> sortedByAge = people.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(Collectors.toList());

        System.out.println("Sorted by age: " + sortedByAge);



        List<Integer> ages = Arrays.asList(24, 32, 28, 24, 32, 28, 24);
        List<Integer> uniqueAges = ages.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique ages: " + uniqueAges);



        List<Person> firstThree = people.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("First three people: " + firstThree);



        List<Person> afterSkippingThree = people.stream()
                .skip(3)
                .collect(Collectors.toList());

        System.out.println("After skipping three people: " + afterSkippingThree);


        //terminal operations
        List<String> namesList = people.stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Names: " + namesList);


        long count = people.stream()
                .count();

        System.out.println("Number of people: " + count);



        people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(p -> System.out.println("Oldest person: " + p.getName()));

        people.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .ifPresent(p -> System.out.println("Youngest person: " + p.getName()));




        IntSummaryStatistics ageStatistics = people.stream()
                .mapToInt(Person::getAge)
                .summaryStatistics();

        System.out.println("Sum of ages: " + ageStatistics.getSum());
        System.out.println("Average age: " + ageStatistics.getAverage());



        people.stream()
                .filter(p -> p.getAge() > 25)
                .findFirst()
                .ifPresent(p -> System.out.println("First person older than 25: " + p.getName()));


        people.stream()
                .filter(p -> p.getAge() > 25)
                .findAny()
                .ifPresent(p -> System.out.println("Any person older than 25: " + p.getName()));



        boolean allAdults = people.stream()
                .allMatch(p -> p.getAge() > 18);

        System.out.println("Are all people adults? " + allAdults);



        boolean anyoneOver30 = people.stream()
                .anyMatch(p -> p.getAge() > 30);

        System.out.println("Is anyone over 30? " + anyoneOver30);


        boolean noChildren = people.stream()
                .noneMatch(p -> p.getAge() < 18);

        System.out.println("Are there no children? " + noChildren);




        List<String> namess = List.of("Alice", "Daniel", "Ivan", "Irina", "Ruck", "Dima");

        List<String> result = namess.stream()
                .filter(n -> n.startsWith("D"))
                .sorted(Comparator.reverseOrder())
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
