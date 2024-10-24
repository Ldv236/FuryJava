package ru.ldv236.OOP.objectsClassesOld;


import java.util.ArrayList;
import java.util.List;

public class Departament <T extends Client> {

    private List<T> people = new ArrayList<>();

    public void addPeople(T p) {
        people.add(p);
    }
}
