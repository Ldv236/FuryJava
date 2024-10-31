package ru.ldv236.patterns.creational.builder;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String hello = "Hello, World";

        StringBuilder builder = new StringBuilder();
        builder.append(hello)
                .delete(0, 6)
                .reverse();
        System.out.println(builder);


        House house = new House.Builder()
                .floors(2)
                .hasGarden(true)
                .hasGarage(false)
                .build();

        System.out.println(house);

        /*В классе House приватный конструктор и статический вложенный класс Builder. Это значит, что создать экземпляр
        House напрямую нельзя, только через Builder.
        Builder предоставляет методы с понятными названиями для установки параметров будущего объекта.
        Каждый такой метод возвращает самого себя (this), что позволяет использовать цепочки вызовов (method chaining).
        Метод build() создает и возвращает готовый объект House с заданными характеристиками.
                Таким образом, паттерн Строитель позволяет создавать сложные объекты пошагово,
                делая код более читаемым и удобным для понимания.
    */
    }
}
