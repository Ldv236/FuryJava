package ru.ldv236.patterns.creational.factoryMethod.factories;

// Конкретный класс для транспортировки кораблём
public class SeaLogistics extends Transport {
    @Override
    public Vehicle createTransport() {
        return new Ship(); // Возвращаем объект корабля
    }

    // Класс корабля (реализует интерфейс Vehicle)
    private static class Ship implements Vehicle {
        @Override
        public String getName() {
            return "Ship";
        }

        @Override
        public void deliver() {
            System.out.println("Delivering by sea in a container.");
        }
    }
}