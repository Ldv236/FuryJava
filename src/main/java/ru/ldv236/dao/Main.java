package ru.ldv236.dao;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PersonDao personDao = new FilePersonDao("test.txt");

        Person person1 = new Person("Ivan", 30);
        Person person2 = new Person("Petr", 32);

        personDao.addPerson(person1);
        personDao.addPerson(person2);

        Person found = personDao.findPerson("Petr");
        System.out.println(found);
    }
}