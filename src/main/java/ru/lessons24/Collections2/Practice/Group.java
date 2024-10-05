package ru.lessons24.Collections2.Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Group {
    private final Map<Integer, Student> students;

    public Group() {
        this.students = new HashMap<>();
    }

    // Метод для добавления студента в группу
    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    // Метод для удаления студента из группы
    public void removeStudent(int id) {
        students.remove(id);
    }

    // Метод для получения всех студентов
    public Map<Integer, Student> getAllStudents() {
        return students;
    }

    // Получить список всех имен студентов
    public List<String> getStudentNames() {
        return students.values().stream()
                .map(Student::getName)
                .toList();
    }

    // Получить студентов старше определенного возраста
    public List<Student> getStudentsBetweenAge(int age1, int age2) {
        return students.values().stream()
                .filter(s -> s.getAge() >= age1 && s.getAge() <= age2)
                .toList();
    }

    // Сортировка студентов по возрасту
    public List<Student> getSortedByNameAge() {
        return students.values().stream()
                .sorted((s1, s2) -> {
                    if (s1.getName().compareTo(s2.getName()) == 0) {
                        return Integer.compare(s1.getAge(), s2.getAge());
                    } else {
                        return s1.getName().compareTo(s2.getName());
                    }
                })
                .toList();
    }

    public Map<Student, Double> getAverageGrades() {
        return students.values().stream()
                .collect(Collectors.toMap(Function.identity(), Student::getAverageGrade));
    }
}