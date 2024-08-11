package ru.ldv236.collections;

import java.util.Comparator;

public class PersonComparator  implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {

        int nameCompare = p1.getName().compareTo(p2.getName());
        if (nameCompare == 0) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
        return nameCompare;
    }
}
