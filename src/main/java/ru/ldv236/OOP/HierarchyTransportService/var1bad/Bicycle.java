package ru.ldv236.OOP.HierarchyTransportService.var1bad;

public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем велосипедную покрышку");
    }
}
