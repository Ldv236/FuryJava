package ru.ldv236.OOP.Constructors;


public class Main {
    public static void main(String[] args) {

        Car toyota = new Car();
        toyota.model = "Toyota";
        toyota.color = "Blue";
        toyota.year = 2016;
        System.out.println("Пустой конструктор и отдельная инициализация полей: " + toyota.getInfo());

        toyota = new Car("Toyota");
        System.out.println("Конструктор с одним параметром model: " + toyota.getInfo());

        toyota = new Car("Toyota", "Blue", 2020);
        System.out.println("Конструктор с тремя параметрами: " + toyota.getInfo());

        toyota = new Car("Toyota", "Blue", 2030);
        System.out.println("Конструктор с тремя параметрами: " + toyota.getInfo());
    }
}
