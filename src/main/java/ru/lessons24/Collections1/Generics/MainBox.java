package ru.lessons24.Collections1.Generics;

public class MainBox {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello, World!");
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<>(123);
        System.out.println(integerBox);
    }
}
