package ru.ldv236.objectClass;


import java.util.ArrayList;
import java.util.List;

public class Departament <T extends Client> {

    private List<T> people = new ArrayList<>();

    public void addPeople(T p) {
        people.add(p);
    }
}
