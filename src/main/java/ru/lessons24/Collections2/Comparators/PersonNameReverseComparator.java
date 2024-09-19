package ru.lessons24.Collections2.Comparators;

import java.util.Comparator;

public class PersonNameReverseComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
