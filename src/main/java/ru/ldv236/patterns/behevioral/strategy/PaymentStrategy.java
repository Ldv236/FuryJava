package ru.ldv236.patterns.behevioral.strategy;

// Интерфейс для стратегии оплаты
interface PaymentStrategy {
    void pay(int amount);
}