package ru.ldv236.OOP.deepCopy;

public class Hobby implements Cloneable  {
    private String name;

    public Hobby(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // конструктор копирования
    public Hobby(Hobby hobby) {
        this.name = hobby.name;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Hobby clone() throws CloneNotSupportedException {
        return (Hobby) super.clone();
    }
}