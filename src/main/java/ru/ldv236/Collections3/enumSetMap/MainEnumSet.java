package ru.ldv236.Collections3.enumSetMap;

import java.util.EnumSet;

public class MainEnumSet {
    public static void main(String[] args) {
        // Создание EnumSet с использованием всех элементов перечисления
        EnumSet<Status> statusSet = EnumSet.allOf(Status.class);
        //итерация по EnumSet
        for (Status status : statusSet) {
            System.out.print(status + " ");
        }
        System.out.println();

        // Добавление элементов
        statusSet.add(Status.NEW);
        statusSet.addAll(EnumSet.of(Status.RUNNING, Status.WAITING));

        // Удаление элемента
        statusSet.remove(Status.ERROR);

        // Проверка наличия элемента
        boolean containsFinished = statusSet.contains(Status.FINISHED);

        //итерация по EnumSet
        for (Status status : statusSet) {
            System.out.print(status + " ");
        }
    }
}
