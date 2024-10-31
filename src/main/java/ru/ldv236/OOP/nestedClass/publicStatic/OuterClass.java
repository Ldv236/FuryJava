package ru.ldv236.OOP.nestedClass.publicStatic;

public class OuterClass {
    // Поле внешнего класса
    private static String staticField = "Static Field of OuterClass";

    // Публичный статический вложенный класс
    public static class StaticNestedClass {
        public void display() {
            // Доступ к статическим полям внешнего класса
            System.out.println("Accessing: " + staticField);
        }
    }
}
