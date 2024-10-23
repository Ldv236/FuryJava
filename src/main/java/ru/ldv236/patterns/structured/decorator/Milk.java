package ru.ldv236.patterns.structured.decorator;

class Milk extends CondimentDecorator {
//    Декораторы будут также наследоваться от Beverage и иметь ссылку на декорируемый объект Beverage.
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}