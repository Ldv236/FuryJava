package ru.ldv236.lesson10_Exception_IO_DAO.DAO;

import java.util.List;

public interface PersonDao {
    void addPerson(Person person);
    List<Person> getAllPeople();
    Person findPerson(String name);
}