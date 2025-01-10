package ru.ldv236.junitTest.stud;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void add(String firstName, String lastName, int age) {
        Student student = new Student(firstName, lastName, age);
        studentRepository.save(student);
    }

    public Student getById(long id) {
        return studentRepository.findById(id);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
