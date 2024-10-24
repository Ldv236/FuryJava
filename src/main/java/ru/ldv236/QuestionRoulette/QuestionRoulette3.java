package ru.ldv236.QuestionRoulette;

import java.util.Random;
import java.util.Scanner;

public class QuestionRoulette3 {
    public static void main(String[] args) {
        String[] questions = {
                "чем отличается работа префиксного и постфиксного инкремента (++a и a++)",
                "расскажите про оператор if-else, switch-case и тернарный оператор",
                "как можно сравнивать примитивы и ссылочные типы, какие есть особенности?",
                "лайвкодинг"
        };

        Random rand = new Random();
        boolean[] isAnswered = new boolean[30];
        for (int i = 0; i < questions.length; ) {
            int toAnswer = rand.nextInt(isAnswered.length);

            if (!isAnswered[toAnswer]) {
                isAnswered[toAnswer] = true;
            }
            System.out.println("Вопрос " + (i + 1) + " - " + (toAnswer + 1) + " - " + questions[i]);
            i++;
        }

        while (true) {
            Scanner sc = new Scanner(System.in);
            int indexQuestion = sc.nextInt();

            while (true) {
                int toAnswer = rand.nextInt(isAnswered.length);

                if (!isAnswered[toAnswer]) {
                    isAnswered[toAnswer] = true;
                    System.out.println("Вопрос " + indexQuestion + " - " + (toAnswer + 1) + " - " + questions[indexQuestion]);
                    break;
                }
            }
        }
    }
}
