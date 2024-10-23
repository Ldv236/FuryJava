package ru.lessons24.OOP.Abstraction2.model;

import ru.lessons24.OOP.Abstraction2.interfaces.Movable;

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
