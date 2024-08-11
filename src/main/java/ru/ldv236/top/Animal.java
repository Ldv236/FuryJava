package ru.ldv236.top;

abstract public class Animal {

    private String name;

    abstract public void eat();

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
