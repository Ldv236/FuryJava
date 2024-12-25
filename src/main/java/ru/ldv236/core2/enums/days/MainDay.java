package ru.ldv236.core2.enums.days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDay {
    public static void main(String[] args) {
        Group2 group = new Group2();
        group.addLessonDay(DayOfWeek.FRIDAY);
        group.addLessonDay(DayOfWeek.SUNDAY);

        System.out.println(group.getLessonDays());

        System.out.println(DayOfWeek.valueOf("MONDAY"));

        group.getLessonDays().forEach(d -> System.out.println(d.getRussianName()));
        group.getLessonDays().forEach(d -> System.out.println(d.isWorkDay()));

        System.out.println(DayOfWeek.fromRussianName("понедельник"));
//        System.out.println(DayOfWeek.fromRussianName("понедельникк"));

        System.out.println(
                Arrays.toString(
                        DayOfWeek.values()
                ));

        System.out.println(
                DayOfWeek.FRIDAY.ordinal()
        );

        DayOfWeek day1 = DayOfWeek.FRIDAY;
        DayOfWeek day2 = DayOfWeek.FRIDAY;
        System.out.println(day1 == day2);

//        DayOfWeek currentDay = DayOfWeek.TUESDAY;
        DayOfWeek currentDay = DayOfWeek.SATURDAY;
        switch (currentDay) {
            case SATURDAY, SUNDAY -> System.out.println("Сегодня занятие");
            default -> System.out.println("Изучаем джаву сами");
        }

        // + EnumMap and EnumSet (discrete package in this project)
    }
}

class Group2 {
    List<DayOfWeek> lessonDays = new ArrayList<>();

    public void addLessonDay(DayOfWeek day) {
        lessonDays.add(day);
    }

    public List<DayOfWeek> getLessonDays() {
        return lessonDays;
    }
}
