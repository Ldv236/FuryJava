package ru.ldv236.solid.ocp.fix;

public class DefaultTaxCalculator  implements TaxStrategy {

    @Override
    public double calculateTax(double income) {
        return income * 0.1;
    }
}