package ru.ldv236.lesson6OopPrincipl.incapsulation;

public class Clock {

    private String time;

    //другие, недоступные нам напрямую параметры - диаметр шестерней, частота генератора импульсов и т.д.
    //для них не будет геттеров и сеттеров
    //однако, если мы будем работать в доменной области ремонта часов, где вместо класса Me будет класс Часовой мастер,
    //то он сможет разобрать часы и получить доступ к внутренним деталям, т.е. к внутренней реализации

    public Clock(String time) {
        this.time = time;
    }

    public Clock() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        //правила установки времени
        this.time = time;
    }
}
