package ru.ldv236.Collections2.Homework;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        // Добавляем фрукты в магазин
        shop.addProduct("Water");
        shop.addProduct("Milk");
        shop.addProduct("Bread");
        shop.addProduct("Apple");
        shop.addProduct("Kiwi");
        shop.addProduct("Kiwi");
        shop.addProduct("Kiwi");


        // Выводим все фрукты
        System.out.println("All Products in the shop:");
        System.out.println(shop.getAllProducts());

        shop.removeProduct("Water");

        // Фильтруем фрукты по длине названия (больше 5 символов)
        System.out.println("\nProducts with name longer than 4 characters:");
        System.out.println(shop.filterProductsByLength(4));

        // Сортируем фрукты по алфавиту и обратно
        System.out.println("\nProducts sorted alphabetically:");
        System.out.println(shop.getSortedProducts());
        System.out.println(shop.getSortedReversProducts());

        // Получаем список всех фруктов в верхнем регистре
        System.out.println("\nProducts in upper case:");
        System.out.println(shop.getProductsInUpperCase());
    }
}
