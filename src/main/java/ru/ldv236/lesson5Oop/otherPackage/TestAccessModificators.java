package ru.ldv236.lesson5Oop.otherPackage;

import ru.ldv236.lesson5Oop.carPackage.Car;

public class TestAccessModificators {

    Car car2 = new Car();

    void checkAccess() {
        car2.startEngine();
        car2.toString();
    }
}
