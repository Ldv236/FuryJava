package ru.lessons24.PracticeChaper2;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {

        // сгенерировать три случайных числа в диапазоне от 10 до 20 и найти их среднее арифметическое (дабл)
        // затем привести к инту и в диапазоне от нуля до этого числа вывести все четные числа
        // не забыть проверить дебагом промежуточные вычисления

        Random random = new Random();
        int num1 = random.nextInt(5, 15);
        int num2 = random.nextInt(5, 15);
        int num3 = random.nextInt(5, 15);

        double avg = (num1 + num2 + num3) / 3.0;
        int limit = (int) avg;

        for (int j = 1; j < limit; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
