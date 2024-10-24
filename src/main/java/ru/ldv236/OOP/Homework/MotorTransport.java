package ru.ldv236.OOP.Homework;

public abstract class MotorTransport extends WheeledTransport {
    private String engineType;

    public MotorTransport(int numberOfWheels, String engineType) {
        super(numberOfWheels);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void service(){
        super.service();
        serviceEngine();
    }

    public void serviceEngine(){
        System.out.print(" Обслужен " + engineType + " двигатель. ");
    }
}
