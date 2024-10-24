package ru.ldv236.OOP.statics;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creating first object...");
        Entity obj1 = new Entity();
        System.out.println("Object 1 ID: " + obj1.getId());

        System.out.println("\nCreating second object...");
        Entity obj2 = new Entity();
        System.out.println("Object 2 ID: " + obj2.getId());

        // Выводим общее количество созданных объектов через статический метод
        System.out.println("\nTotal count: " + Entity.getCount());

        Entity obj3 = new Entity();
        Entity obj4 = new Entity();
        Entity obj5 = new Entity();

        System.out.println("\nTotal count: " + Entity.getCount());
    }
}
