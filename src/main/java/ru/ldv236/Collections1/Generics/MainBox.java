package ru.ldv236.Collections1.Generics;

public class MainBox {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>(4);
        stringBox.set(0, "Hello");
        stringBox.set(1, "World");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<>(6);
        integerBox.set(0, 111);
        integerBox.set(5, 222);
        System.out.println(integerBox);
    }
}
