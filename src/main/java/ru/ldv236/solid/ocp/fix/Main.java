package ru.ldv236.solid.ocp.fix;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService(new UsaTaxCalculator());
        double tax = taxService.calculate(100);
        System.out.println(tax);

        taxService = new TaxService(new IndiaTaxCalculator());
        tax = taxService.calculate(100);
        System.out.println(tax);
    }
}
