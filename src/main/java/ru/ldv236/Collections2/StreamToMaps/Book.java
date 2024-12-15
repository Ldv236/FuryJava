package ru.ldv236.Collections2.StreamToMaps;

public class Book {
    String title;
    int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title;
    }
}
