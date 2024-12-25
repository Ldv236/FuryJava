package ru.ldv236.core2.files_students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // Создаём репозиторий (файл students.txt в текущей директории)
        StudentRepository studentRepository = new StudentRepository("students.txt");

        // Добавляем студентов
        studentRepository.save(new Student(1, "John", "Doe", 20));
        studentRepository.save(new Student(2, "Jane", "Smith", 22));

        // Читаем всех студентов
        List<Student> students = studentRepository.findAll();
        System.out.println("All students:");
        students.forEach(System.out::println);

        // Ищем студента по ID
        long searchId = 1;
        Optional<Student> student = studentRepository.findById(searchId);
        student.ifPresentOrElse(
                s -> System.out.println("Found student: " + s),
                () -> System.out.println("Student with ID " + searchId + " not found.")
        );


        try {
            Files.delete(Path.of("students.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
