package ru.ldv236.core.PracticeConditionsCycles;

public class Practice {
    public static void main(String[] args) {

//        С помощью цикла for выведите в консоль все числа от 5 до 1.
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

//        Напишите программу, которая выводит в консоль последовательность чисел:
//        7 14 21 28 35
        for (int i = 0; i < 36; i = i + 7) {
            System.out.println(i);
        }

        int i = 1;
        while (true) {
            if (i * 7 < 36) {
                System.out.println(i * 7);
                i++;
            } else {
                break;
            }
        }
    }
}
