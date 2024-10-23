package ru.ldv236.patterns.structured.decorator;

class Coffee extends Beverage {

//    Теперь определим несколько конкретных напитков, расширяя Beverage.
    public Coffee() {
        description = "Coffee";
    }

    public double cost() {
        return 1.99;
    }
}