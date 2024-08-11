package ru.ldv236.lesson10_Exception_IO_DAO;

import java.io.FileNotFoundException;

public class MainExc {
    public static void main(String[] args) {

//        String text = null;
//        try {
//            System.out.println(text.length());
//        } catch (NullPointerException e) {
//            System.out.println("Обращение к методу у объекта null: " + e.getMessage());
//        }
//
//        int[] array = {1, 2, 3};
//        try {
//            System.out.println(array[5]); //индекс за пределами массива
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Доступ к несуществующему индексу массива: " + e.getMessage());
//        }
//
//        try {
//            int result = 10 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("Арифметическая ошибка (деление на ноль): " + e.getMessage());
//        }
//
//        try {
//            int number = Integer.parseInt("abc");
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка преобразования строки в число: " + e.getMessage());
//        }

        try {
            String arg = null;

            if (args.length > 0) {
                arg = args[0];
            }

            System.out.println(arg.length());  // Может вызвать NullPointerException

            arg = args[2]; // Может вызвать ArrayIndexOutOfBoundsException

            System.out.println(10 / Integer.parseInt(arg)); // Может вызвать ArithmeticException или NumberFormatException

        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка обращения к объекту или массиву: " + e.getMessage());
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Арифметическая ошибка или ошибка формата числа: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }



        ExceptionHandlingExample example = new ExceptionHandlingExample();
        try {
            example.readFile("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден.");
            // Дополнительная логика обработки ошибки
        }

        try {
            findDog();
        } catch (DogNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("эгегей");

    }

    static void findDog() {
        throw new DogNotFoundException("нет собачки");
    }
}
