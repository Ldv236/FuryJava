package ru.ldv236.dao;

import java.util.List;

public class DBPersonDao implements PersonDao {
    @Override
    public void addPerson(Person person) {
        //сохранение человека в базу данных
    }

    @Override
    public List<Person> getAllPeople() {
        return null;
    }

    @Override
    public Person findPerson(String name) {
        return null;
    }
}
