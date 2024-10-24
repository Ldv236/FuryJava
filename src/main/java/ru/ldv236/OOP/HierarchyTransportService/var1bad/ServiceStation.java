package ru.ldv236.OOP.HierarchyTransportService.var1bad;

public class ServiceStation {

    public void check(Vehicle vehicle) {

        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }

        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.checkEngine();
        }
        if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicle;
            //truck inherited from car so engine checked in prev scope
            //if truck will inheritance from vehicle then truck.checkEngine(); (ref to my question in Truck.java)
            truck.checkTrailer();
        }
    }
    /*
    По заданию надо применить перегрузку, поэтому сделаны отдельные методы ниже,
    но т.к. их можно заменить одним, то прошу подсказать, что лучше:
    1. Сделать универсальный метод с использованием сужающего приведения, как выше
    2. Сделать перегруженные методы для каждого типа, как ниже, м.б. вынеся повторяющийся код в еще один метод
     */

    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            car.updateTyre();
        }
        car.checkEngine();
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
}