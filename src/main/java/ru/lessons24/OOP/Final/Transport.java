package ru.lessons24.OOP.Final;

public abstract class Transport implements Movable {
    protected String model;
    protected int year;

    // Конструктор суперкласса
    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Сделать финальным типа нехуй, именно такой формат нужен, показать в подклассах, убрать нахер
    public final void describe() {
        System.out.println("Transport: " + model + " (" + year + ")");
    }

    // переопред из мувбл
    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    // переопред из мувбл
    @Override
    public void stop() {
        System.out.println(model + " is stopping.");
    }

    // Переопределение toString() для базовых полей
    @Override
    public String toString() {
        return "model='" + model + "', year=" + year;
    }
}
