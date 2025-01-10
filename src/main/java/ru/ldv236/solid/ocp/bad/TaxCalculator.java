package ru.ldv236.solid.ocp.bad;

public class TaxCalculator {

    public double calculateTax(String country, double income) {
        if (country.equals("USA")) {
            return income * 0.3;
        } else if (country.equals("India")) {
            return income * 0.2;
        } else {
            return income * 0.1; // Дефолтный налог
        }
    }
}
