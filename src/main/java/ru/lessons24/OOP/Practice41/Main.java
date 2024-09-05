package ru.lessons24.OOP.Practice41;

public class Main {
    public static void main(String[] args) {

        // Работа с классами Animal, Dog и Cat
        Animal.speciesInfo();  // Статический метод базового класса

        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        System.out.println(dog.getInfo());

        Cat cat = new Cat("Whiskers", 3, true);
        System.out.println(cat.getInfo());

        // Используем геттеры и сеттеры
        dog.setBreed("Labrador");
        System.out.println("Updated breed: " + dog.getBreed());

        cat.setIndoor(false);
        System.out.println(cat.getName() + " now lives outside: " + cat.isIndoor());
    }
}
