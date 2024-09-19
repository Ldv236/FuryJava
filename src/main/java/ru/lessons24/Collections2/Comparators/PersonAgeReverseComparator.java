package ru.lessons24.Collections2.Comparators;

import java.util.Comparator;

public class PersonAgeReverseComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
