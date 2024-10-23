package ru.ldv236.patterns.structured.decorator;

class Sugar extends CondimentDecorator {
    //    Декораторы будут также наследоваться от Beverage и иметь ссылку на декорируемый объект Beverage.
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}