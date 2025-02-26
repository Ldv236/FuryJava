package ru.ldv236.Collections2.stream3classExample;

import java.math.BigDecimal;

public class Product {
    private String name;
    private String category;
    private BigDecimal price;

    public Product(String name, String category, BigDecimal price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product{name='%s', category='%s', price=%s}", name, category, price);
    }
}
