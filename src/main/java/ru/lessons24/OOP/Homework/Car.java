package ru.lessons24.OOP.Homework;

public final class Car extends MotorTransport {
    private boolean manualTransmission;

    public Car(int numberOfWheels, String engineType, boolean manualTransmission) {
        super(numberOfWheels, engineType);
        this.manualTransmission = manualTransmission;
    }

    public boolean isManualTransmission() {
        return manualTransmission;
    }

    public void setManualTransmission(boolean manualTransmission) {
        this.manualTransmission = manualTransmission;
    }

    @Override
    public void service(){
        super.service();
        serviceCar();
    }

    public void serviceCar(){
        if (manualTransmission) {
            System.out.println("Обсужена механическая коробка переключения передач");
        } else {
            System.out.println("Обсужена автоматическая коробка переключения передач");
        }
    }
}

