package ru.lessons24.OOP.Practice42;

public class Human implements Movable {
    private String name;
    private int steps = 0;  // Поле для хранения количества шагов

    public Human(String name) {
        this.name = name;
    }

    // переопред из мувбл
    @Override
    public void start() {
        steps++;  // Увеличиваем количество шагов при старте
        System.out.println(name + " starts walking.");
    }

    // переопред из мувбл
    @Override
    public void stop() {
        System.out.println(name + " stops walking.");
    }

    @Override
    public int getSteps() {
        return steps;
    }
}
