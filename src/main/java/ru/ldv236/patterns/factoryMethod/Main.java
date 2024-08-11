package ru.ldv236.patterns.factoryMethod;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getClass().getCanonicalName());
    }
}
