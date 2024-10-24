package ru.ldv236.core.PracticeStringArrays;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
    /*
    ●	Получение из консоли строки
    ●	Получение из консоли двух индексов, которые будут использоваться для взятия подстроки
    ●	Индексы складывать в массив int[]
    ●	При получении индексов проверять, что они больше или равны нулю, в противном случае выводить сообщение
        об этом и получать индекс повторно (использовать бесконечный цикл, т.к. неизвестно количество неверных вводов)
    ●	Взять из введенной строки подстроку в соответствии с полученными индексами
    ●	Учесть, что метод substring может выбрасывать исключение – перехватить и обработать его
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку, затем индексы для взятия подстроки");
        String input = scanner.nextLine();
        int[] indexes = new int[2];

        boolean indexValid = false;
        do {
            indexes[0] = scanner.nextInt();
            if (indexes[0] < 0) {
                System.out.println("Индекс не может быть отрицательным");
            } else {
                indexValid = true;
            }
        }
        while (!indexValid);

        while (true) {
            indexes[1] = scanner.nextInt();
            if (indexes[1] < 0) {
                System.out.println("Индекс не может быть отрицательным");
            } else {
                break;
            }
        }

        try {
            input = input.substring(indexes[0], indexes[1]);
            System.out.println("Result substring: " + input);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
