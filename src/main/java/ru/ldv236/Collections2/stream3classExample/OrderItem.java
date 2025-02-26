package ru.ldv236.Collections2.stream3classExample;

import java.math.BigDecimal;

public class OrderItem {
    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getTotalPrice() {
        return product.getPrice().multiply(BigDecimal.valueOf(quantity));
    }

    @Override
    public String toString() {
        return String.format("OrderItem{product=%s, quantity=%d, totalPrice=%s}",
                product, quantity, getTotalPrice());
    }
}
