package ru.ldv236.lesson6OopPrincipl.incapsulation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello OOP!");

        Clock myClock2D = new Clock("12:00");
        System.out.println("Текущее время: " + myClock2D.getTime());

        myClock2D.setTime("1:00");
        System.out.println("Новое время: " + myClock2D.getTime());


        Clock myClock = new Clock("12:00");
        Me me = new Me(myClock);

        System.out.println("Текущее время: " + me.viewTime());
        me.changeTime("1:00");
        System.out.println("Новое время: " + me.viewTime());
    }
}