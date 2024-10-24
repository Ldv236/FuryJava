package ru.ldv236.OOP.Abstraction2.model;

import ru.ldv236.OOP.Abstraction2.interfaces.Refuelable;

public abstract class MotorTransport extends Transport implements Refuelable {
    // о боби, метод рефьюел надо исплементировать здесь, либо в подклассах
    protected String engineType;

    public MotorTransport(String model, int year, String engineType) {
        super(model, year);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void refuel() {
        switch (engineType) {
            case "gasoline" -> System.out.println("95, пожалуйста");
            case "diesel" -> System.out.println("дизеля плесните");
        }
    }
}
