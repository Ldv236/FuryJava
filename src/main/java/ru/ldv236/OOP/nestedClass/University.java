package ru.ldv236.OOP.nestedClass;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    // Метод для добавления студента
    public void addStudent(String studentName, int studentId) {
        Student newStudent = new Student(studentName, studentId);
        students.add(newStudent);
    }

    // Метод для отображения списка студентов
    public void displayStudents() {
        System.out.println("Students of " + name + ":");
        for (Student student : students) {
            System.out.println("ID: " + student.studentId + ", Name: " + student.studentName);
        }
    }

    // Вложенный класс Student
    private class Student {
        private String studentName;
        private int studentId;

        public Student(String studentName, int studentId) {
            this.studentName = studentName;
            this.studentId = studentId;
        }
    }
}