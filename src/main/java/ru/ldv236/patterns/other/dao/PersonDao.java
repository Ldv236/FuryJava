package ru.ldv236.patterns.other.dao;

import java.util.List;

public interface PersonDao {

    void addPerson(Person person);

    List<Person> getAllPeople();

    Person findPerson(String name);
}
