package ru.lessons24.PracticeStringArrays;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        /*
        ●	Получение из консоли строки
        ●	Получение из консоли двух символов – какой надо найти, и на какой следует его заменить
            (у класса сканер нет метода nextChar, поэтому можно использовать nextLine().charAt(0))
        ●	Индексы складывать в массив char[]
        ●	При получении первого символа проверять, что он существует в исходной строке, иначе выводить сообщение
            об этом и получать символ повторно (метод indexOf при отсутствии символа в строке возвращает результат -1)
        ●	Произвести замену полученных символов (метод replace)
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, затем символы для замены (сначала какой найти, потом на что заменить)");
        String input = scanner.nextLine();
        char[] chars = new char[2];

        while (true) {
            chars[0] = scanner.nextLine().charAt(0);
            if (input.indexOf(chars[0]) >= 0) {
                break;
            } else {
                System.out.println("Такого символа нет в строке, введите еще раз");
            }
        }

        chars[1] = scanner.nextLine().charAt(0);
        input = input.replace(chars[0], chars[1]);
        System.out.println(input);
    }
}
