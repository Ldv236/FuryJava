package ru.ldv236.patterns.behevioral.strategy;

import java.util.ArrayList;
import java.util.List;

// Класс, который использует стратегию оплаты
class ShoppingCart {
    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    // Метод, который использует стратегию для оплаты
    public void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}