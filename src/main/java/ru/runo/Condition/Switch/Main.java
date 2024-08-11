package ru.runo.Condition.Switch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //объявляем целочисленную (int) переменную
        int number;
        //инициализируем переменную случайным числом от 1 до 9
        Random rand = new Random();
        number = rand.nextInt(1, 10);
        System.out.print("Печать дня из case, " + number + " - ");

        switch (number) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неверный номер дня недели");
        }

        String day;
        day = switch (number) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверный номер дня недели";
        };
        System.out.println("Только присвоение значения в case, " + number + " - " + day);

        String dayType;
        dayType = switch (number) {
            case 1, 2, 3, 4, 5 -> "Будний день";
            case 6, 7 -> "Выходной";
            default -> "Неверный номер дня недели";
        };
        System.out.println("Только присвоение значения в case, " + number + " - " + dayType);

    }
}
