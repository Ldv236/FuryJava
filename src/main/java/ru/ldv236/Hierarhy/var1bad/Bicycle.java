package ru.ldv236.Hierarhy.var1bad;

public class Bicycle extends Vehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем велосипедную покрышку");
    }
}
