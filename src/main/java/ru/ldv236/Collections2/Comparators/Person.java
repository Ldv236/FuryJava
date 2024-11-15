package ru.ldv236.Collections2.Comparators;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{"+ name + ", " + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

//    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
//
//    }

    @Override
    public int compareTo(Person o) {
        return Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge)
                .compare(this, o);
    }
}
