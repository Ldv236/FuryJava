package ru.lessons24.QuestionRoulette;

import java.util.Random;
import java.util.Scanner;

public class QuestionRoulette {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Арсланов Эдуард"),
                new Student("Богданова Кристина"),
                new Student("Вавилин Константин"),
                new Student("Власов Артём"),
                new Student("Горчаков Михаил"),
                new Student("Губарев Андрей"),
                new Student("Даймонд Анна"),
                new Student("Дубовицкий Вячеслав"),
                new Student("Жиров Максим"),
                new Student("Иванов Артемий"),
                new Student("Иванова Анастасия"),
                new Student("Клементьев Никита"),
                new Student("Корякин Вячеслав"),
                new Student("Матвеев Владислав"),
                new Student("Медведев Игорь"),
                new Student("Моисеева Ярослава"),
                new Student("Морозов Никита"),
                new Student("Петин Евгений"),
                new Student("Пляшечников Виталий"),
                new Student("Прусов Дмитрий"),
                new Student("Соколов Константин"),
                new Student("Сташевский Вадим"),
                new Student("Ферт Глеб"),
                new Student("Харьков Александр"),
                new Student("Челидзе Теона"),
                new Student("Шестаков Александр"),
                new Student("Юришин Алексей"),
                new Student("Юрченко Алексей"),
                new Student("Яшнов Александр")
        };
        Student currStudent;


        String[] questions = {
                "Что такое ООП?",
                "Какие преимущества у ООП? Какие недостатки у ООП?",
                "В чем заключается принцип инкапсуляции и с помощью чего он реализуется в джаве?"
        };


        Random rand = new Random();
        for (int i = 0; i < questions.length; ) {
            int toAnswer = rand.nextInt(students.length);
            currStudent = students[toAnswer];

            if (!currStudent.isAnswered()) {
                currStudent.setAnswered(true);
                System.out.println("Вопрос " + (i + 1) + " - " + currStudent + " - " + questions[i]);
                i++;
            }
        }

        while (true) {
            Scanner sc = new Scanner(System.in);
            int indexQuestion = sc.nextInt();

            while (true) {
                int toAnswer = rand.nextInt(students.length);
                currStudent = students[toAnswer];

                if (!currStudent.isAnswered()) {
                    currStudent.setAnswered(true);
                    System.out.println("Вопрос " + indexQuestion + " - " + currStudent + " - " + questions[indexQuestion - 1]);
                    break;
                }
            }
        }
    }
}
