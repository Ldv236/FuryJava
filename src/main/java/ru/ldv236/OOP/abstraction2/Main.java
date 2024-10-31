package ru.ldv236.OOP.abstraction2;

import ru.ldv236.OOP.abstraction2.interfaces.Movable;
import ru.ldv236.OOP.abstraction2.interfaces.Refuelable;
import ru.ldv236.OOP.abstraction2.model.Bike;
import ru.ldv236.OOP.abstraction2.model.Car;
import ru.ldv236.OOP.abstraction2.model.Human;
import ru.ldv236.OOP.abstraction2.model.Truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // показать сначала что ок, а потом с абстрактным нифига
//        Transport someTransport = new Transport("Lada", 2020);

        // Создаем объекты разных типов ДЛЯ ИГРЫ, чтобы в игре двигать любой объект одними и теми же кнопками (клавишами)
        Movable car = new Car("Tesla Model S", 2022, "gasoline", 4);
        Movable truck = new Truck("Volvo FH16", 2018, "diesel" ,18000);
        Movable bike = new Bike("Merida", 2020, true);
        Movable human = new Human("John");

        // Добавляем все объекты в массив для обработки полиморфизма
        Movable[] movables = {car, truck, bike, human};
        // Проверяем работу через интерфейс Movable
        for (Movable movable : movables) {
            moveAnyMovableObject(movable);
            System.out.println();
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
                case "bike" -> bike;
                case "human" -> human;
                default -> null;
            };
            moveAnyMovableObject(someMovable);

            //проверяем - если рефьюебл, то заправляем (сначала надо кастануть)
            if (someMovable instanceof Refuelable) {
//                Refuelable someRefuelable = (Refuelable) someMovable;
//                someRefuelable.refuel();
                ((Refuelable) someMovable).refuel();
            }
            // а еще лучше так
            if (someMovable instanceof Refuelable someRefuelable) {
                someRefuelable.refuel();
            }
        }
    }

    // Универсальный метод для работы с объектами через интерфейс Movable
    public static void moveAnyMovableObject(Movable movable) {
        movable.start(); // Вызываем метод start через интерфейс
        movable.highlightPosition();
    }
}
