package ru.ldv236.deepCopy;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person copyPerson = new Person(person);
        person.clone();
    }
}

