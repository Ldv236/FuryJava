package ru.lessons24.OOP.Practice42;

public abstract class Transport implements Movable {
    protected String model;
    protected int year;
    protected int steps = 0;  // Поле для хранения количества шагов

    // Конструктор суперкласса
    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Метод для описания транспорта
    public void describe() {
        System.out.println("Transport: " + model + " (" + year + ")");
    }

    // переопред из мувбл
    @Override
    public void start() {
        steps++;  // Увеличиваем количество шагов при старте
        System.out.println(model + " is starting.");
    }

    // переопред из мувбл
    @Override
    public void stop() {
        System.out.println(model + " is stopping.");
    }

    @Override
    public int getSteps() {
        return steps;
    }

    // Переопределение toString() для базовых полей
    @Override
    public String toString() {
        return "model='" + model + "', year=" + year;
    }
}
