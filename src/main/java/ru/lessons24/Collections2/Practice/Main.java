package ru.lessons24.Collections2.Practice;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        Student s1 = new Student(123, "Anna", 17);
        Student s2 = new Student(201, "Alice", 18);
        Student s3 = new Student(202, "Bob", 19);
        Student s4 = new Student(360, "John", 20);

        s1.addGrade(6, 9, 6);
        s2.addGrade(8, 7);
        s4.addGrade(7, 8, 7, 5);

        // Добавляем студентов в группу
        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);
        // Выводим список всех студентов
        System.out.println("All students:");
        System.out.println(group.getAllStudents());
        group.removeStudent(202);
        // Получить список всех имен студентов
        System.out.println("\nNames of all students:");
        System.out.println(group.getStudentNames());
        // Найти всех студентов, которым 18 and 19
        System.out.println("\nStudents between 18 and 19:");
        System.out.println(group.getStudentsBetweenAge(18, 19));
        // Сортировка студентов по возрасту
        System.out.println("\nStudents sorted by name and age:");
        System.out.println(group.getSortedByNameAge());
        // средние оценки в мапе
        System.out.println("\nСредние оценки студентов:");
        System.out.println(group.getAverageGrades());
    }
}
