package ru.ldv236.solid.ocp.fix;

public class TaxService {

    private TaxStrategy taxStrategy;

    public TaxService(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculate(double income) {
        return taxStrategy.calculateTax(income);
    }
}
