package ru.ldv236.patterns.decorator;

abstract class Beverage {

//    Сначала создадим абстрактный класс Beverage (Напиток), который будет представлять как основные напитки, так и добавки.
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}