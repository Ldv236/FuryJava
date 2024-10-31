package ru.ldv236.OOP.nestedClass.privateStatic;

public class OuterClass {
    private static String staticField = "Static Field of OuterClass";

    public void usePrivateNested() {
        PrivateStaticNestedClass nested = new PrivateStaticNestedClass();
        nested.display();
    }

    // Приватный статический вложенный класс
    private static class PrivateStaticNestedClass {
        public void display() {
            System.out.println("Accessing: " + staticField);
        }
    }
}