package ru.ldv236.OOP.nestedClass.privateNonStatic;

public class OuterClass {
    private String instanceField = "Instance Field of OuterClass";

    // Приватный внутренний класс
    private class PrivateInnerClass {
        public void display() {
            System.out.println("Accessing: " + instanceField);
        }
    }

    public void usePrivateInner() {
        PrivateInnerClass inner = new PrivateInnerClass();
        inner.display();
    }
}