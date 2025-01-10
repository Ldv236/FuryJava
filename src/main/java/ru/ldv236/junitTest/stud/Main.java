package ru.ldv236.junitTest.stud;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository(
                "src/main/java/ru/ldv236/junitTest/stud/students");
        StudentService studentService = new StudentService(studentRepository);

        studentService.add("Ivan", "Ivanov", 30);
        studentService.add("Petr", "Petrov", 31);
        studentService.add("Sergey", "Sergeev", 32);

        System.out.println(studentService.getById(1L));

        studentService.getAll().forEach(System.out::println);
    }
}
