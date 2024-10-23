package ru.lessons24.QuestionRoulette;

public class Student {
    private String name;
    private boolean isAnswered;

    public Student(String name) {
        this.name = name;
        this.isAnswered = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    @Override
    public String toString() {
        return "Student{" + name + '}';
    }
}
