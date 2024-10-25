package ru.ldv236.patterns.creational.factoryMethod.factories;

// Абстрактный базовый класс с фабричным методом
public abstract class Transport {

    // Фабричный метод — должен быть реализован в подклассах
    public abstract Vehicle createTransport();

    // Общая логика, которая использует фабричный метод
    public void startTransport() {
        Vehicle vehicle = createTransport();
        System.out.println("Starting the transport with " + vehicle.getName());
        vehicle.deliver();
    }
}