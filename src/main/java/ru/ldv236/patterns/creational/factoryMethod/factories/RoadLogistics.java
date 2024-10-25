package ru.ldv236.patterns.creational.factoryMethod.factories;

// Конкретный класс для транспортировки грузовиком
public class RoadLogistics extends Transport {
    @Override
    public Vehicle createTransport() {
        return new Truck(); // Возвращаем объект грузовика
    }

    // Класс грузовика (реализует интерфейс Vehicle)
    private static class Truck implements Vehicle {
        @Override
        public String getName() {
            return "Truck";
        }

        @Override
        public void deliver() {
            System.out.println("Delivering by land in a box.");
        }
    }
}

