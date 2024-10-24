package ru.ldv236.OOP.Practice42;

public class Human implements Movable {
    private String name;
    private int steps = 0;  // Поле для хранения количества шагов

    public Human(String name) {
        this.name = name;
    }

    // переопред из мувбл
    @Override
    public void start(int stepCount) {
//        steps++;  // Увеличиваем количество шагов при старте
        steps += stepCount;  // Увеличиваем количество шагов при старте
        System.out.println(name + " starts walking.");
    }

    @Override
    public int getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return "Name - " + name;
    }
}
