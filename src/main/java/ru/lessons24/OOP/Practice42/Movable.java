package ru.lessons24.OOP.Practice42;

public interface Movable {
//    void start();
    void start(int stepCount);

    // добавим подсчет количества объектов каждого типа и подсчет шагов в каждый объект
    // а в метод подсветки позиции вызов получения этих самых шагов
    int getSteps();

    // в практике этот метод есть, из урока про абстракцию
    default void highlightPosition() {
        System.out.println("Подсветка положения игрового объекта на поле, координаты: " + getSteps());
    }
}
