package ru.ldv236.OOP.finalKeyword;

public final class Human implements Movable {
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
