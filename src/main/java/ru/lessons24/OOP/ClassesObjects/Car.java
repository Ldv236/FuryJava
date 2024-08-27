package ru.lessons24.OOP.ClassesObjects;

public class Car {
    // Поля класса
    String model;
    String color;
    int year;

    public void start() {
//        System.out.println("Двигатель заведен");
//        System.out.println(model + " - Двигатель заведен");
        //потом типа чё добавлять цвет и год в три места? лучше отдельный метод создать!
        System.out.println(getInfo() + " - Двигатель заведен");
    }

    public void ride() {
//        System.out.println("Поехали");
//        System.out.println(model + " - Поехали");
        //потом типа чё добавлять цвет и год в три места? лучше отдельный метод создать!
        System.out.println(getInfo() + " - Поехали");
    }

    public void stop() {
//        System.out.println("Остановка");
//        System.out.println(model + " - Остановка");
        //потом типа чё добавлять цвет и год в три места? лучше отдельный метод создать!
        System.out.println(getInfo() + " - Остановка");
    }

    public String getInfo() {
        String info = model + " " + color + " " + year;
        return info;
    }
}
