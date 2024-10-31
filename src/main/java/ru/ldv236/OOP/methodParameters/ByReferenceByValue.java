package ru.ldv236.OOP.methodParameters;

public class ByReferenceByValue {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Toyota";
        car.color = "Blue";
        car.year = 2016;

        changeCarData(car);
        System.out.println("Исходный объект после вызова метода: " + car.getInfo());
        System.out.println();

        int number = 10;
        changeNumber(number);
        System.out.println("Исходный примитив int после вызова метода: " + number);

    }

    public static void changeNumber(int num) {
        System.out.println("Полученный параметр int в методе: " + num);
        num = num * 2;
        System.out.println("Измененный параметр int в методе: " + num);
    }


    public static void changeCarData(Car car) {
        System.out.println("Полученный параметр в методе: " + car.getInfo());
        car.model = "Ford";
        System.out.println("Измененный параметр в методе (изменено поле): " + car.getInfo());

        car = new Car();
        car.model = "Mazda";
        car.color = "Orange";
        car.year = 2010;
        System.out.println("Измененный параметр в методе (весь объект заменен на новый): " + car.getInfo());

    }
}
