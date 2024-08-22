package ru.lessons24;

import java.util.Scanner;

public class outIn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите ваш возраст:");
        int age = scanner.nextInt();

        System.out.println("Обучающйся: " + name + ", " + age + " лет");
    }
}
