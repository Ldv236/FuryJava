package ru.ldv236.patterns.behevioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Создаем корзину и добавляем товары
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Laptop", 1000));
        cart.addItem(new Item("Phone", 500));


        Map<String, PaymentStrategy> paymentStrategies = new HashMap<>();
        paymentStrategies.put("PayPal", new PayPalPayment("user@example.com", "password123"));
        paymentStrategies.put("CreditCard", new CreditCardPayment("1234-5678-9012-3456", "John Doe", "123", "12/23"));

        // Переменная, которая поступает извне (например, от пользователя)
//        String paymentType = "PayPal";
        String paymentType = "CreditCard";

        // Выбор стратегии на основе значения переменной
        PaymentStrategy strategy = paymentStrategies.get(paymentType);

        // Проверяем, что стратегия существует, и вызываем оплату
        if (strategy != null) {
            cart.pay(strategy);  // Вызов оплаты через выбранную стратегию
        } else {
            System.out.println("Payment method not recognized.");
        }
    }
}
// Объяснение:
// Контекст (ShoppingCart): содержит логику расчета и управления товарами в корзине. Он использует стратегию для оплаты.
// Стратегии: PayPalPayment и CreditCardPayment — это две разные реализации интерфейса PaymentStrategy,
// которые реализуют логику оплаты различными способами.

// Клиентский код: создаёт объекты корзины и товаров, выбирает стратегию оплаты (PayPal или кредитную карту)
// и передаёт её в метод pay() корзины.

// Преимущества паттерна Стратегия:
// Гибкость: позволяет легко изменять поведение объекта во время выполнения.
// Расширяемость: добавление новых стратегий (например, новых способов оплаты) не требует изменений в существующем коде.
// Снижение дублирования кода: реализация конкретных алгоритмов изолирована в отдельных классах.

// Когда использовать Стратегию:
// Когда у вас есть несколько алгоритмов или способов выполнения одного и того же действия, и вам нужно гибко переключаться между ними.
// Когда вы хотите инкапсулировать различное поведение, чтобы изолировать его и сделать код более читаемым и поддерживаемым.