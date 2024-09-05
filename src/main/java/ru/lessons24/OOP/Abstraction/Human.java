package ru.lessons24.OOP.Abstraction;

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

    // переопред из мувбл
    @Override
    public void stop() {
        System.out.println(name + " stops walking.");
    }
}
