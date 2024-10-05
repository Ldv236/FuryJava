package ru.lessons24.OOP.getClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getClass());

        Object object = new Object();
        System.out.println(object.getClass());

        Object object2 = new Car();
        System.out.println(object2.getClass());
    }
}
