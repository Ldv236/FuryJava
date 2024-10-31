package ru.ldv236.OOP.nestedClass.publicNonStatic;

public class Main {
    public static void main(String[] args) {
        // Создание объекта внутреннего класса через объект внешнего класса
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
