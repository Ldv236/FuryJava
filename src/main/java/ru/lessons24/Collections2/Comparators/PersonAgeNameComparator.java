package ru.lessons24.Collections2.Comparators;

import java.util.Comparator;

public class PersonAgeNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge() != o2.getAge()) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else {
            return Integer.compare(o1.getName().length(), o2.getName().length());
        }
    }
}
