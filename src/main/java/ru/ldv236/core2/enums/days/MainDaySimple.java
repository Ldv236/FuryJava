package ru.ldv236.core2.enums.days;

import java.util.ArrayList;
import java.util.List;

public class MainDaySimple {
    public static void main(String[] args) {
        Group group = new Group();
        group.addLessonDay(DayOfWeekSimple.FRIDAY);
        group.addLessonDay(DayOfWeekSimple.SUNDAY);

        System.out.println(group.getLessonDays());
    }
}

class Group {
    List<DayOfWeekSimple> lessonDays = new ArrayList<>();

    public void addLessonDay(DayOfWeekSimple day) {
        lessonDays.add(day);
    }

    public List<DayOfWeekSimple> getLessonDays() {
        return lessonDays;
    }
}
