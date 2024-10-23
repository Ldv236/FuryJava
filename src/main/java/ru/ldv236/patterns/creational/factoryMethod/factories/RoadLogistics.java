package ru.ldv236.patterns.creational.factoryMethod.factories;

import ru.ldv236.patterns.creational.factoryMethod.classes.Truck;
import ru.ldv236.patterns.creational.factoryMethod.classes.Vehicle;

// Конкретный класс для транспортировки грузовиком
public class RoadLogistics extends Transport {
    @Override
    public Vehicle createTransport() {
        return new Truck(); // Возвращаем объект грузовика
    }
}
