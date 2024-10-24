package ru.ldv236.CollectionsOld;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Переопределение toString() для вывода информации об объекте
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    @Override
    public int compareTo(Person person) {
        int compare = getName().compareTo(person.getName());
        return compare;
    }
}
