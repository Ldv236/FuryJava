package ru.ldv236.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(',');
        builder.append("World!");
        System.out.println(builder.toString());


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
