package ru.ldv236.core2.files_students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentRepository {
    private final Path filePath;

    public StudentRepository(String fileName) {
        this.filePath = Path.of(fileName);

        // Создаём файл, если он не существует
        try {
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }
        } catch (IOException e) {
            throw new RuntimeException("Could not initialize repository file", e);
        }
    }

    // Метод добавления студента
    public void save(Student student) {
        try {
            // Дописываем нового студента в файл
//            Files.write(filePath, (student.toString() + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            Files.write(filePath, (student.toString() + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Could not add student", e);
        }
    }

    // Метод чтения всех студентов
    public List<Student> findAll() {
        try {
            // Читаем все строки из файла и преобразуем их в объекты Student
            return Files.readAllLines(filePath)
                    .stream()
//                    .map(Student::fromString)
                    .map(Student::new)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Could not read students", e);
        }
    }

    // Метод поиска студента по id
    public Optional<Student> findById(long id) {
        return findAll().stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }
}
