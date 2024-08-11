package ru.ldv236.lesson5Oop;

import ru.ldv236.lesson5Oop.carPackage.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "tesla";
        Car car2 = new Car();
        car.brand = "ford";

        System.out.println(car.equals(car2));

    }
}
