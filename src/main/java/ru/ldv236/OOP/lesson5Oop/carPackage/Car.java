package ru.ldv236.OOP.lesson5Oop.carPackage;

public class Car {
    // Публичная переменная
    public String brand;

    // Приватная переменная
    private int year;

    // Защищенная переменная
    protected String color;

    // Переменная с модификатором доступа по умолчанию
    String model;

    // Публичный метод
    public void startEngine() {
        System.out.println("Двигатель запущен.");
    }

    // Приватный метод
    private void stopEngine() {
        System.out.println("Двигатель остановлен.");
    }

    // Защищенный метод
    protected void changeColor(String newColor) {
        color = newColor;
        System.out.println("Цвет автомобиля изменен на " + color);
    }

    // Метод с модификатором доступа по умолчанию
    void displayModel() {
        System.out.println("Модель автомобиля: " + model);
    }
}