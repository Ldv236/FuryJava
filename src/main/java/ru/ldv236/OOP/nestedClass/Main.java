package ru.ldv236.OOP.nestedClass;

public class Main {
    public static void main(String[] args) {
        University university = new University("Harvard");

        // Добавляем студентов в университет
        university.addStudent("Alice Smith", 1001);
        university.addStudent("Bob Johnson", 1002);

        // Отображаем список студентов
        university.displayStudents();
    }
}