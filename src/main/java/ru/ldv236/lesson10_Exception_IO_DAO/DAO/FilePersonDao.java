package ru.ldv236.lesson10_Exception_IO_DAO.DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FilePersonDao implements PersonDao {
    private Path filePath;

    public FilePersonDao(String fileName) {
        this.filePath = Paths.get(fileName);
    }

    @Override
    public void addPerson(Person person) {
        try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            writer.write(person.getName() + "," + person.getAge());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Person> getAllPeople() {
        List<Person> people = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 2) {
                    Person person = new Person(parts[0], Integer.parseInt(parts[1]));
                    people.add(person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }

    @Override
    public Person findPerson(String name) {
        List<Person> people = getAllPeople();
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }
}