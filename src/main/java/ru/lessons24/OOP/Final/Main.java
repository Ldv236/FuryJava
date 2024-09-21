package ru.lessons24.OOP.Final;

import java.util.Scanner;

public class Main {
    public static final int STEP_TO_WIN = 3;

    public static void main(String[] args) {
        // сделать классы финальными и показать что наследовать не получается и значки
        // потом метод сабскрайб в транспорте тоже

        // идея подсказывает про файнал - потому что нет сеттера, только инициализация в конструкторе
        // показать что если сделать сеттер, то подсказка исчезнет, либо сделать файнал двери

        // потом константу уже ввести и показать что нельзя поменять, но использовать в практике уже

        // и параетр в методе сделать файнал, ибо

        System.out.println("Шагов для победы - " + STEP_TO_WIN);
//        STEP_TO_WIN = 5;

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

            switch (movableObjectName) {
                case "car":
                    someMovable = car;
                    break;
                case "truck":
                    someMovable = truck;
                    break;
                case "human":
                    someMovable = human;
                    break;
                default:
                    someMovable = null;
                    System.out.println("unknown movable name: " + movableObjectName);
            }
//            someMovable = switch (movableObjectName) {
//                case "car" -> car;
//                case "truck" -> truck;
//                case "human" -> human;
//                default -> null;
//            };
            moveAnyMovableObject(someMovable);
        }
    }

    // Универсальный метод для работы с объектами через интерфейс Movable
    public static void moveAnyMovableObject(final Movable movable) {
        // показать также и параметр может быть файнал
//        movable = new Car("Vaz", 2020, 5);
        movable.start(); // Вызываем метод start через интерфейс
        movable.highlightPosition();
    }
}
