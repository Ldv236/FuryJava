package ru.ldv236.streamApi;

public class Main {
    public static void main(String[] args) {

        StreamWithPersons streamWithPersons = new StreamWithPersons();
//        streamWithPersons.doStream();

        StreamWithArray streamWithArray = new StreamWithArray();
//        streamWithArray.doStream();

        StreamTasks streamTasks = new StreamTasks();
        streamTasks.doTask1();
        streamTasks.doTask2();
        streamTasks.doTask3();
        streamTasks.doTask4();
        streamTasks.doTask5();
        streamTasks.doTask6();

    }
}