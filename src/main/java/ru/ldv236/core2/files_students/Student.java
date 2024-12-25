package ru.ldv236.core2.files_students;

public class Student {
    private long id;
    private String name;
    private String surname;
    private int age;

    // Конструкторы, геттеры и сеттеры
    public Student(long id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + surname + "," + age;
    }

    public Student (String line) {
        String[] parts = line.split(",");
        this.id = Long.parseLong(parts[0]);
        this.name = parts[1];
        this.surname = parts[2];
        this.age = Integer.parseInt(parts[3]);
    }

    public static Student fromString(String line) {
        String[] parts = line.split(",");
        return new Student(
                Long.parseLong(parts[0]),
                parts[1],
                parts[2],
                Integer.parseInt(parts[3])
        );
    }
}
