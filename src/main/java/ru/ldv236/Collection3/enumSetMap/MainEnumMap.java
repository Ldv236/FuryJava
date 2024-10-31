package ru.ldv236.Collection3.enumSetMap;

import java.util.EnumMap;

public class MainEnumMap {
    public static void main(String[] args) {
        // Создание EnumMap
        EnumMap<TaskState, String> taskMap = new EnumMap<>(TaskState.class);

        // Добавление значений
        taskMap.put(TaskState.PENDING, "Task1");
        taskMap.put(TaskState.RUNNING, "Task2");
        taskMap.put(TaskState.COMPLETED, "Task3");

        // Получение значения
        String runningTask = taskMap.get(TaskState.RUNNING);
        System.out.println("Running Task: " + runningTask);

        //итерация по EnumMap
        taskMap.forEach((state, task) -> {
            System.out.println(state + " : " + task);
        });

    }
}