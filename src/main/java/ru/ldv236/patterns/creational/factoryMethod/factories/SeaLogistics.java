package ru.ldv236.patterns.creational.factoryMethod.factories;

import ru.ldv236.patterns.creational.factoryMethod.classes.Ship;
import ru.ldv236.patterns.creational.factoryMethod.classes.Vehicle;

// Конкретный класс для транспортировки кораблём
public class SeaLogistics extends Transport {
    @Override
    public Vehicle createTransport() {
        return new Ship(); // Возвращаем объект корабля
    }
}