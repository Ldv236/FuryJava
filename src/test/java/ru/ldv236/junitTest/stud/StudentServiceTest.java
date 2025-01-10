package ru.ldv236.junitTest.stud;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentRepository repository;
    private StudentService service;


    @BeforeEach
    void setUp() throws IOException {
        System.out.println("before each test");
        // + сделать акцент на том, что реальное хранилище не затрагивается, создается временный файл отдельный
        repository = new StudentRepository("src/test/java/ru/ldv236/junitTest/stud/students");
        service = new StudentService(repository);
    }

    @AfterEach
    void tearDown() throws IOException {
        System.out.println("after each test");
        // Удаляем временный файл после тестов
        repository.clean();
        repository = null;
        service = null;
    }

    @Test
    void addStudents_getAll() {
        System.out.println("addStudents_getAll test");

        // Given
        // создали бы студентов, но они создаются уже в сервисе

        // When
        service.add("Ivan", "Ivanov", 30);
        service.add("Petr", "Petrov", 31);
        service.add("Sergey", "Sergeev", 32);
        List<Student> students = service.getAll();

        // Then
        assertEquals(3, students.size());
        assertEquals("Ivan", students.get(0).getName());
        assertEquals("Petrov", students.get(1).getSurname());
        assertEquals(32, students.get(2).getAge());
    }

    @Test
    void getById_find3Students() {
        System.out.println("getById_find3Students test");

        // Given
        Student student1 = new Student("Ivan", "Ivanov", 30);
        student1.setId(1L);

        Student student2 = new Student("Petr", "Petrov", 31);
        student2.setId(2L);

        Student student3 = new Student("Sergey", "Sergeev", 32);
        student3.setId(3L);

        // When
        service.add("Ivan", "Ivanov", 30);
        service.add("Petr", "Petrov", 31);
        service.add("Sergey", "Sergeev", 32);
        Student result1 = service.getById(1L);
        Student result2 = service.getById(2L);
        Student result3 = service.getById(3L);

        // Then
        assertEquals(result1, student1);
        assertEquals(result2, student2);
        assertEquals(result3, student3);
    }


    @Test
    void getById_throwException() {
        System.out.println("getById_throwException test");

        // Given

        // When
        service.add("Ivan", "Ivanov", 30);

        // Then
        assertThrows(RuntimeException.class, () -> service.getById(0L));
        assertThrows(RuntimeException.class, () -> service.getById(2L));
        assertThrows(RuntimeException.class, () -> service.getById(3L));
        assertDoesNotThrow(() -> service.getById(1L));
    }
}