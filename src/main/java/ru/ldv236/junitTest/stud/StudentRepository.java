package ru.ldv236.junitTest.stud;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class StudentRepository {
    private final Path filePath;
    // ОТЕЛЬНО СОХРАНЯТЬ ПОСЛЕДНИЙ ПРИСВОЕННЫЙ ID
    private final Path filePathId;
    private Long id;

    public StudentRepository(String file) {
        this.filePath = Path.of(file);
        this.filePathId = Path.of(file + "_id");
        id = 0L;

        try {
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
            }

            if (Files.exists(filePathId)) {
                String fileId = Files.readString(filePathId);
                id = Long.parseLong(fileId);
            } else {
                Files.createFile(filePathId);
                Files.write(filePathId, id.toString().getBytes());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void save(Student student) {
        student.setId(++id);
        try {
            Files.write(filePath, (student + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            Files.write(filePathId, id.toString().getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public List<Student> findAll() {
        try {
            return Files.readAllLines(filePath).stream()
                    .map(Student::new)
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Student findById(Long id) {
            return findAll().stream()
                    .filter(student -> student.getId() == id)
                    .findFirst().orElseThrow(() -> new RuntimeException("Student not found"));
    }
    //findById
    //findByName - List

    public void clean() throws IOException {
        Files.delete(filePath);
        Files.delete(filePathId);
    }
}
