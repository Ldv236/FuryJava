package ru.ldv236.OOP.abstraction2.model;

import ru.ldv236.OOP.abstraction2.interfaces.Movable;

public class Human implements Movable {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    // переопред из мувбл
    @Override
    public void start() {
        System.out.println(name + " starts walking.");
    }
}
