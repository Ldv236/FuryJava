package ru.ldv236.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        // Создаем оригинальный объект
        Rectangle original = new Rectangle(10, 20, "Blue");
        System.out.println("Original: " + original);

        // Клонируем объект
        Rectangle clone = (Rectangle) original.clone();
        System.out.println("Clone: " + clone);

        // Изменяем свойства клона
        clone.setColor("Red");
        System.out.println("Modified Clone: " + clone);

        // Убедимся, что оригинальный объект не изменился
        System.out.println("Original after modification: " + original);
    }
}
