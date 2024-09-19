package ru.lessons24.Collections2.Practice;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final int age;
    private final List<Integer> grades;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int... grades) {
        for (int grade : grades) {
            if (grade > 0 && grade < 10) {
                this.grades.add(grade);
            } else {
                System.out.println("Invalid grade: " + grade);
            }
        }
    }

    public double getAverageGrade() {
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();

//        return grades.stream().mapToDouble(x -> x).average().orElse(0);
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }
}
