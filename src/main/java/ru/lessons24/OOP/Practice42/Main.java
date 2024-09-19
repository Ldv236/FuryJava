package ru.lessons24.OOP.Practice42;

import java.util.Scanner;

public class Main {

    public static final int STEP_TO_WIN = 3;
    // потом переносим её сюда чтобы видеть из разных методов
    public static boolean isGameEnd = true;

    public static void main(String[] args) {
        System.out.println("Шагов для победы - " + STEP_TO_WIN);
        // это уже после того как игра "завершается", но цикл продолжается
//        boolean isGameEnd = true;

        // Создаем объекты разных типов ДЛЯ ИГРЫ, чтобы в игре двигать любой объект одними и теми же кнопками (клавишами)
        Car car = new Car("Tesla Model S", 2022, 4);
        Truck truck = new Truck("Volvo FH16", 2018, 18000);
        Human human = new Human("John");

        // Имитация получения объекта извне сервиса
        Scanner in = new Scanner(System.in);
        Movable someMovable;
        while (isGameEnd) {
            System.out.print("Какую игровую фигуру двигаем: ");
            String movableObject = in.nextLine();

            String[] movableArray = movableObject.split(" ");

            someMovable = switch (movableArray[0]) {
                case "car" -> car;
                case "truck" -> truck;
                case "human" -> human;
                default -> null;
            };

            int stepCount = Integer.parseInt(movableArray[1]);

            moveAnyMovableObject(someMovable, stepCount);
            System.out.println("**************");
        }
    }

    // Универсальный метод для работы с объектами через интерфейс Movable
    public static void moveAnyMovableObject(Movable movable, int stepCount) {
        movable.start(stepCount); // Вызываем метод start через интерфейс
        movable.highlightPosition();   // Подсвечиваем положение объекта

        //переносим из метода мейн, чтобы использовать в других методах
//        if (movable.getSteps() == STEP_TO_WIN) {
        if (movable.getSteps() >= STEP_TO_WIN) {
            finishAndShowResults(movable);
        }
    }

    public static void finishAndShowResults(Movable movable) {
        isGameEnd = false;
        System.out.println("Игра завершена!");
        System.out.println("Победитель - " + movable.toString() + ", счет - " + movable.getSteps());
    }
}
