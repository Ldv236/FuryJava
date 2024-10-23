package ru.ldv236.patterns.structured.decorator;

class Tea extends Beverage {
    //    Теперь определим несколько конкретных напитков, расширяя Beverage.
    public Tea() {
        description = "Tea";
    }

    public double cost() {
        return 1.49;
    }
}