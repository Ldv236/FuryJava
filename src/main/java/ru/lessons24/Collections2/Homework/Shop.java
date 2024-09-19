package ru.lessons24.Collections2.Homework;


import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private final Set<String> products = new HashSet<>();

    // Метод для добавления продукта в магазин
    public void addProduct(String product) {
        products.add(product);
    }

    // Метод для удаления продукта из магазина
    public void removeProduct(String product) {
        products.remove(product);
    }

    // Метод для получения всех продуктов
    public Set<String> getAllProducts() {
        return products;
    }

    // Метод для фильтрации продуктов по длине их названий
    public Set<String> filterProductsByLength(int length) {
        return products.stream()
                .filter(product -> product.length() > length)
                .collect(Collectors.toSet());
    }

    // Метод для сортировки продуктов по алфавиту
    public List<String> getSortedProducts() {
        return products.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .sorted(String::compareTo)
                .collect(Collectors.toList());
    }

    // Метод для сортировки продуктов по алфавиту
    public List<String> getSortedReversProducts() {
        return products.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // Получить список всех продуктов в верхнем регистре
    public List<String> getProductsInUpperCase() {
        return products.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
