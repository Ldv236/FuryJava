package ru.ldv236.OOP.lesson5Oop.ParameterPass;

public class ParamPassExmpl2 {
    public static void main(String[] args) {
        CarParams car = new CarParams("Toyota", 150);
        System.out.println("Before method call: " + car.getModel() + " " + car.getHorsePower());

        // Передача параметра по значению
        passByValue(car);
        System.out.println("After passByValue method call: " + car.getModel() + " " + car.getHorsePower());

        // Передача параметра по ссылке
        CarParams anotherCar = new CarParams("BMW", 200);
        System.out.println("Before passByReference method call: " + anotherCar.getModel() + " " + anotherCar.getHorsePower());
        passByReference(anotherCar);
        System.out.println("After passByReference method call: " + anotherCar.getModel() + " " + anotherCar.getHorsePower());
    }

    // Метод, который принимает параметр по значению
    public static void passByValue(CarParams car) {
        car.setModel("Honda");
        car.setHorsePower(180);
        System.out.println("Inside passByValue method: " + car.getModel() + " " + car.getHorsePower());
    }

    // Метод, который принимает параметр по ссылке
    public static void passByReference(CarParams car) {
        car = new CarParams("Mercedes", 250);
        System.out.println("Inside passByReference method: " + car.getModel() + " " + car.getHorsePower());
    }
}
