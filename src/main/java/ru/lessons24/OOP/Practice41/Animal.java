package ru.lessons24.OOP.Practice41;

public class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getInfo() {
        return "Name: " + name + ", Age: " + age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void speciesInfo() {
        System.out.println("Это базовый класс для всех животных.");
    }
}
