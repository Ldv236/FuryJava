package ru.ldv236.solid.ocp.fix;

import ru.ldv236.solid.ocp.bad.TaxCalculator;

public class UsaTaxCalculator implements TaxStrategy {

    @Override
    public double calculateTax(double income) {
        return income * 0.3;
    }
}
