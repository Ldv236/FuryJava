package ru.ldv236.solid.ocp.fix;

public class IndiaTaxCalculator implements TaxStrategy {

    @Override
    public double calculateTax(double income) {
        return income * 0.2;
    }
}
