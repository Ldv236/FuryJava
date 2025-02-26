package ru.ldv236.Collections2.stream3classExample;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        Product laptop = new Product("Laptop", "Electronics", new BigDecimal("1200.00"));
        Product phone = new Product("Smartphone", "Electronics", new BigDecimal("800.00"));
        Product book = new Product("Java Book", "Books", new BigDecimal("50.00"));
        Product tablet = new Product("Tablet", "Electronics", new BigDecimal("600.00"));
        Product chair = new Product("Office Chair", "Furniture", new BigDecimal("150.00"));

        // Создание элементов заказа (OrderItem)
        OrderItem item1 = new OrderItem(laptop, 1);
        OrderItem item2 = new OrderItem(phone, 2);
        OrderItem item3 = new OrderItem(book, 3);
        OrderItem item4 = new OrderItem(tablet, 1);
        OrderItem item5 = new OrderItem(chair, 4);

        // Создание заказов (Order)
        Order order1 = new Order(Arrays.asList(item1, item3), "NEW");
        Order order2 = new Order(Arrays.asList(item2, item4), "PROCESSING");
        Order order3 = new Order(Arrays.asList(item5), "DELIVERED");

        List<Order> orders = Arrays.asList(order1, order2, order3);

        // --- Примеры работы со Stream API ---
        //что-то простое








//        // 1. Фильтрация: Найти все заказы со статусом "NEW"
//        List<Order> newOrders = orders
//
//        System.out.println("Заказы со статусом NEW: " + newOrders);
//
//        // 2. Подсчёт общей суммы всех заказов
//        BigDecimal totalRevenue = orders
//
//        System.out.println("Общая сумма всех заказов: " + totalRevenue);
//
//        // 3. Группировка товаров по категориям
//        Map<String, List<Product>> productsByCategory = orders.stream()
//
//        System.out.println("Группировка товаров по категориям: " + productsByCategory);
//
//        // 4. Сортировка заказов по общей стоимости (по убыванию)
//        List<Order> sortedOrders = orders.stream()
//
//        System.out.println("Заказы, отсортированные по общей стоимости: " + sortedOrders);
//
//        // 5. Получить список всех уникальных названий продуктов из заказов
//        Set<String> productNames = orders.stream()
//
//        System.out.println("Все уникальные названия продуктов: " + productNames);
//
//        // 6. Найти самый дорогой товар в заказах
//        Optional<Product> mostExpensiveProduct = orders.stream()


    }
}
