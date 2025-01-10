package ru.ldv236.patterns.creational.prototype;

// Класс Rectangle, реализующий клонирование
public class Rectangle implements Prototype {
    private int width;
    private int height;
    private String color;

    // Конструктор
    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Реализация метода clone
    @Override
    public Prototype clone() {
        return new Rectangle(this.width, this.height, this.color);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
    }

    // Геттеры и сеттеры (опционально)
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
