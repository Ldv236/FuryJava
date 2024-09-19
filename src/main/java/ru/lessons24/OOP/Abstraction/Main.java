package ru.lessons24.OOP.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // показать сначала что ок, а потом с абстрактным нифига
//        Transport someTransport = new Transport("Lada", 2020);

        // Создаем объекты разных типов ДЛЯ ИГРЫ, чтобы в игре двигать любой объект одними и теми же кнопками (клавишами)
        Movable car = new Car("Tesla Model S", 2022, 4);
        Movable truck = new Truck("Volvo FH16", 2018, 18000);
        Movable human = new Human("John");

        // Добавляем все объекты в массив для обработки полиморфизма
        Movable[] movables = {car, truck, human};

        // Работа через интерфейс Movable
        for (Movable movable : movables) {
            moveAnyMovableObject(movable);
        }

        // Имитация получения объекта извне сервиса
        Scanner in = new Scanner(System.in);
        Movable someMovable;
        while (true) {
            System.out.print("Какую игровую фигуру двигаем: ");
            String movableObjectName = in.nextLine();
            someMovable = switch (movableObjectName) {
                case "car" -> car;
                case "truck" -> truck;
                case "human" -> human;
                default -> null;
            };
            moveAnyMovableObject(someMovable);
        }
    }

    // Универсальный метод для работы с объектами через интерфейс Movable
    public static void moveAnyMovableObject(Movable movable) {
        movable.start(); // Вызываем метод start через интерфейс
        movable.highlightPosition();
    }
}
