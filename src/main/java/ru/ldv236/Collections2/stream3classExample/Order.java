package ru.ldv236.Collections2.stream3classExample;

import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private List<OrderItem> items;
    private String status; // Например: "NEW", "PROCESSING", "SHIPPED", "DELIVERED"

    public Order(List<OrderItem> items, String status) {
        this.id = UUID.randomUUID().toString();
        this.items = items;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Order{id='%s', status='%s', items=%s}", id, status, items);
    }
}
