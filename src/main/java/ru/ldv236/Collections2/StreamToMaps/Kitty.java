package ru.ldv236.Collections2.StreamToMaps;

import java.util.Objects;

public class Kitty {
    int id;
    String name;
    int year;

    public Kitty(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kitty kitty = (Kitty) o;
        return id == kitty.id && year == kitty.year && Objects.equals(name, kitty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year);
    }

    @Override
    public String toString() {
        return "{" + id + ' ' + name + ' ' + year + '}';
    }
}
