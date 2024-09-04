package ru.lessons24.OOP.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Полиморфизм: Используем базовый тип Transport для ссылок на подклассы
        Transport car = new Car("Tesla Model S", 2022, 4);
        Transport truck = new Truck("Volvo FH16", 2018, 18000);
        Transport bike = new Bike("Mountain Bike", 2020, true);

        // Вызов универсального метода для всех объектов
        universalStart(car);
        universalStart(truck);
        universalStart(bike);

        // Вызов метода для проверки типа и вызова уникальных методов
        checkTypeAndCallMethods(car);
        checkTypeAndCallMethods(truck);
        checkTypeAndCallMethods(bike);

        // Имитация получения объекта извне сервиса
        Scanner in = new Scanner(System.in);
        Transport someTransport;
        while (true) {
            System.out.print("Введите тип транспорта, который нужно обработать: ");
            String transportType = in.nextLine();
            someTransport = switch (transportType) {
                case "car" -> car;
                case "truck" -> truck;
                case "bike" -> bike;
                default -> null;
            };
            checkTypeAndCallMethods(someTransport);
        }
    }

    // Универсальный метод для вызова метода start()
    public static void universalStart(Transport transport) {
        transport.start();  // Вызываем метод start() для объекта Transport
    }

    // Метод для проверки типа объекта и вызова уникальных методов
    public static void checkTypeAndCallMethods(Transport transport) {
        try {
            if (transport instanceof Car) {
                Car car = (Car) transport;  // Приведение к типу Car
                car.honk();                 // Вызов уникального метода Car
            } else if (transport instanceof Truck) {
                Truck truck = (Truck) transport;  // Приведение к типу Truck
                truck.load();                     // Вызов уникального метода Truck
            } else if (transport instanceof Bike) {
                Bike bike = (Bike) transport;      // Приведение к типу Bike
                bike.ringBell();                   // Вызов уникального метода Bike
            } else {
                System.out.println("Unknown type of transport.");
            }
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
