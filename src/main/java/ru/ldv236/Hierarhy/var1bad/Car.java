package ru.ldv236.Hierarhy.var1bad;

public class Car extends Vehicle implements MotorVehicleService {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем автомобильную покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}