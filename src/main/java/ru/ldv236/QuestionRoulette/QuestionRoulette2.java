package ru.ldv236.QuestionRoulette;

import java.util.Random;

public class QuestionRoulette2 {
    public static void main(String[] args) {

        String q1 = "чем отличается работа префиксного и постфиксного инкремента (++a и a++)";
        String q2 = "расскажите про оператор if-else, switch-case и тернарный оператор";
        String q3 = "как можно сравнивать примитивы и ссылочные типы, какие есть особенности?";
        String q4 = "лайвкодинг";

        Random rand = new Random();

        int firstAnswer = rand.nextInt(1, 30); // псевдослучайные
        System.out.println("first answer: " + firstAnswer);
        int secondAnswer;
        int thirdAnswer;
        int fourthAnswer;

        do {
            secondAnswer = rand.nextInt(1, 30);
            System.out.println("secondAnswer: " + secondAnswer);
        } while (secondAnswer == firstAnswer);
        do {
            thirdAnswer = rand.nextInt(1, 30);
            System.out.println("thirdAnswer: " + thirdAnswer);
        } while (thirdAnswer == secondAnswer || thirdAnswer == firstAnswer);
        do {
            fourthAnswer = rand.nextInt(1, 30);
            System.out.println("fourthAnswer: " + fourthAnswer);
        } while (thirdAnswer == secondAnswer || thirdAnswer == firstAnswer || fourthAnswer == thirdAnswer);

        System.out.println("Вопрос 1 - " + firstAnswer + " - " + q1);
        System.out.println("Вопрос 2 - " + secondAnswer + " - " + q2);
        System.out.println("Вопрос 3 - " + thirdAnswer + " - " + q3);
        System.out.println("Вопрос 4 - " + fourthAnswer + " - " + q4);
    }
}
