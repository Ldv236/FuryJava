package ru.ldv236.Hierarhy.var2;

public final class Truck extends MotorTransport{
    private int truckLoadCapacity;

    public Truck(int numberOfWheels, String engineType, int truckLoadCapacity) {
        super(numberOfWheels,engineType);
        this.truckLoadCapacity = truckLoadCapacity;
    }

    public int getTruckLoadCapacity() {
        return truckLoadCapacity;
    }

    public void setTruckLoadCapacity(int truckLoadCapacity) {
        this.truckLoadCapacity = truckLoadCapacity;
    }

    @Override
    public void service(){
        super.service();
        serviceTruck();
    }

    public void serviceTruck(){
        System.out.println("Обслужен грузовик с максимальной грузоподъемностью " + truckLoadCapacity + " тонн.");
    }
}
