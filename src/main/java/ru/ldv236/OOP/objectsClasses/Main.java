package ru.ldv236.OOP.objectsClasses;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты различных транспортных средств
        Car car = new Car("Tesla Model S", 2022, 4);
        Bike bike = new Bike("Mountain Bike", 2020, true);
        Truck truck = new Truck("Volvo FH16", 2018, 18_000);

        // Выводим строковые представления объектов
        String carToString = car.toString();
        System.out.println(carToString);
        System.out.println(bike.toString());
        System.out.println(truck);
    }
}
