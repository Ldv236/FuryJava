package ru.ldv236.OOP.hierarchyTransportService.var2;

public class CarService {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle(2, "горный");
        Bicycle bicycle2 = new Bicycle(2, "дорожный");
        Car car1 = new Car(4, "бензиновый", true);
        Car car2 = new Car(4, "дизельный", false);

        WheeledTransport[] transports = {bicycle1, bicycle2, car1, car2};

        for (WheeledTransport transport : transports) {
            ServiceStation.serviceTransport(transport);
        }
    }
}
