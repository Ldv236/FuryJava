package ru.ldv236.top;

public class Elefant extends Animal implements Soundable {

    public Elefant(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating grass");
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " is trumpets");
    }
}
