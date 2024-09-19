package ru.ldv236.Hierarhy.var2;

public final class Bicycle extends WheeledTransport {
    private String typeOfBike;

    public Bicycle(int numberOfWheels, String typeOfBike) {
        super(numberOfWheels);
        this.typeOfBike = typeOfBike;
    }

    public String getTypeOfBike() {
        return typeOfBike;
    }

    public void setTypeOfBike(String typeOfBike) {
        this.typeOfBike = typeOfBike;
    }

    @Override
    public void service() {
        super.service();
        serviceBike();
    }

    public void serviceBike() {
        System.out.println(" Обслужено навесное оборудование велосипеда типа " + "\""
                + typeOfBike + "\"" + ".");
    }
}
