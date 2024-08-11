package ru.ldv236.top;

public class Lion extends Animal implements Soundable {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating meat");
    }

    @Override
    public void makeSound() {
        System.out.println(super.getName() + " is roars");
    }
}
