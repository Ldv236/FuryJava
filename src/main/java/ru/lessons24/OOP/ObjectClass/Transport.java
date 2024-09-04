package ru.lessons24.OOP.ObjectClass;

public class Transport {
    protected String model;
    protected int year;

    // Конструктор суперкласса
    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Метод для описания транспорта
    public void describe() {
        System.out.println("Transport: " + model + " (" + year + ")");
    }

    // Метод для начала движения
    public void start() {
        System.out.println(model + " is starting to move.");
    }

//    @Override
//    public String toString() {
//        return "Transport{" +
//                "model='" + model + '\'' +
//                ", year=" + year +
//                '}';
//    }

    // Переопределение toString() для базовых полей
    @Override
    public String toString() {
        return "model='" + model + "', year=" + year;
    }
}
