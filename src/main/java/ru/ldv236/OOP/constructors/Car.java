package ru.ldv236.OOP.constructors;

import java.time.LocalDate;

public class Car {
    String model;
    String color;
    int year;

    public Car() {
    }

//    public Car(String model) {
//        this.model = model;
//    }

    public Car(String model) {
        this(model, "unknown", 0);
    }

//    public Car(String model, String color, int year) {
//        this.model = model;
//        this.color = color;
//        this.year = year;

//    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        if (year > LocalDate.now().getYear()) {
            System.out.println("Некорректный год: " + year);
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    //явно указать что метод из этого класса
    public void start() {
        System.out.println(this.getInfo() + " - Двигатель заведен");
    }

    //примем параметра - скорости, в мейне добавить просто цифру
    public void ride(int speed) {
        System.out.println(this.getInfo() + " - Поехали, скорость - " + speed);
    }

    //добавить перегруженый метод без параметра, убрать скорость,
    // сказать про область видимости, вызвать тоже в мейне
    public void ride() {
        System.out.println(this.getInfo() + " - Поехали");
    }

    /**
     * @param speeds
     * @throws IllegalArgumentException если скорость больше 100 км/ч
     */
    public void ride(int... speeds) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder();
        for (int value : speeds) {
            sb.append(value).append(" - ");
            //это уже после разбора вараргсов, для демонстрации исключений из методов
            if (value > 100) {
                throw new IllegalArgumentException("Слишком быстро (%d км/ч), получен штраф".formatted(value));
            }
        }
        System.out.println(getInfo() + " - Поехали, скорость - " + sb);
    }

    public void stop() {
        System.out.println(getInfo() + " - Остановка");
    }

    public String getInfo() {
        String info = model + " " + color + " " + year;
        return info;
    }
}
