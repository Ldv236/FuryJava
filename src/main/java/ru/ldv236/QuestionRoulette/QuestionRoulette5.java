package ru.ldv236.QuestionRoulette;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QuestionRoulette5 {

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Student> students = Group.students;
        List<String> questions = QuestionList.questions;

        while (true) {
            try {
                String questionMessage = getQuestion(students, questions);
                System.out.println(questionMessage);
            } catch (RouletteException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     *
     * @param students
     * @param questions
     * @return
     */
    private static String getQuestion(List<Student> students, List<String> questions) {

        int indexQuestion;
        Student currStudent;
        String currentQuestion = "---";

        while (true) { // цикл пока не найдется студент, который еще не отвечал

            try {
                indexQuestion = scanner.nextInt();
                currentQuestion = questions.get(indexQuestion - 1);
                currStudent = students.get(random.nextInt(students.size()));

                if (!currStudent.isAnswered()) {
                    currStudent.setAnswered(true);
                    return indexQuestion + " - " + currStudent + " - " + currentQuestion;
                }
            }  catch (ArrayIndexOutOfBoundsException e) { // Exception      // | InputMismatchException
//                System.out.println(e.getMessage()); // логирование
//                return "Неверный индекс вопроса - " + e.getMessage(); // возвращение результата
                throw new RouletteException("Неверный индекс вопроса - " + e.getMessage());
            } catch (InputMismatchException e) {
//                System.out.println(e.getMessage()); // логирование
//                return "Неверный ввод - " + sc.next();
                throw new RouletteException("Неверный ввод - " + scanner.next());
            } catch (Exception e) {
//                return "Какая-то другая ошибка - " + e.getMessage();
                throw new RouletteException("Какая-то другая ошибка - " + e.getMessage());
            }
        }
    }
}
