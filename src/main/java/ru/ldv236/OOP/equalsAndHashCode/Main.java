package ru.ldv236.OOP.equalsAndHashCode;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", 2022, 4);
        Car car2 = new Car("Tesla Model S", 2022, 4);
//        Car car2 = new Car("Tesla Model S", 2022, 5);

        // Проверка равенства по умолчанию (сравниваются ссылки)
        System.out.println("Equals: " + car1.equals(car2)); // true
        System.out.println("Equals by ==: " + (car1 == car2)); // false
        System.out.println("HashCode car1: " + car1.hashCode());
        System.out.println("HashCode car2: " + car2.hashCode());
        System.out.println("Car1 == car2 by hashCode: " +
                (car1.hashCode() == car2.hashCode()));

        boolean compareResult = Objects.equals(car1, car2);
        System.out.println("compareResult - " + compareResult);
    }
}

