package ru.lessons24.OOP.Abstraction2.interfaces;

public interface Movable {
    void start();

    // потом добавляем метод, все классы в ахуе, меняем его на дефолтный
    // для подсветки положения объекта на игровом поле
    default void highlightPosition() {
        System.out.println("Подсветка положения игрового объекта на поле, координаты: + координаты");
    }
}
