package ru.ldv236.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Создание экземпляра класса Transport
        Transport transport = new Transport("Generic", 2020);
        transport.describe();  // Output: Transport: Generic (2020)
        transport.start();  // Output: Generic is starting to move.

        // Создание экземпляра класса Car
        Car car = new Car("Lada", 2020, 4);
        car.describe();  // Output: Car: Toyota Camry (2022), Doors: 4
        car.start();  // Output: Toyota Camry is revving the engine and starting to move.
        car.honk();      // Output: Beep! Beep!

        // Создание экземпляра класса Bike
        Bike bike = new Bike("Merida", 2020, true);
        bike.describe();  // Output: Bike: Giant (2021), Gears: Yes
        bike.start();  // Output: Giant is starting to pedal.
        bike.ringBell();  // Output: Ring! Ring!

        // Создание экземпляра класса Truck
        Truck truck = new Truck("KAMAZ", 2015, 20000);
        truck.describe();  // Output: Truck: Volvo FH (2019), Load Capacity: 20000 kg
        truck.start();  // Output: Volvo FH is engaging gears and starting to move.
        truck.load();      // Output: Loading the truck with capacity: 20000 kg
    }
}
