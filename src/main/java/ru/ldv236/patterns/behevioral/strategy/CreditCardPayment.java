package ru.ldv236.patterns.behevioral.strategy;

// Стратегия оплаты с помощью кредитной карты
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String name;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String cardNumber, String name, String cvv, String dateOfExpiry) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Credit Card.");
    }
}