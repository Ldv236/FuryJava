package ru.ldv236.OOP.HierarchyTransportService.var2;

public abstract class WheeledTransport implements Transport{
    private int wheelCount;

    public WheeledTransport(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void service(){
        System.out.printf("Обслужено колес - " + wheelCount + ".");
    }
}
