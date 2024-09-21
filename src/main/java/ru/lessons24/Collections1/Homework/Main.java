package ru.lessons24.Collections1.Homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Список водителей
        ArrayList<String> drivers = new ArrayList<>();
        drivers.add("Иван");
        drivers.add("Петр");
        drivers.add("Дмитрий");
        drivers.add("Олег");
        drivers.add("Денис");

        // Очередь учеников
        LinkedList<String> students = new LinkedList<>();
        students.offer("Жанна");
        students.offer("Дарья");
        students.offer("Анна");

        // Объект машины, который будет хранить списки водителей и учеников
        Car car = new Car();
        Random random = new Random();

        // Имитация 3 учебных выездов
        for (int i = 0; i < 3 && !students.isEmpty(); i++) {
            // Случайный водитель (без проверки, ездил ли он уже)
            String driver = drivers.get(random.nextInt(drivers.size()));
            // Извлекаем ученика из начала очереди с помощью poll()
            String student = students.poll();
            // Добавляем водителя и ученика в списки в объекте Car
            car.addDriverAndStudent(driver, student);
            System.out.println("Выезд: Водитель - " + driver +
                    ", Ученик - " + student);
        }

        // Отчёт по водителям: кто участвовал хотя бы в одном выезде
        List<String> driversFromCar = car.getDrivers();
        System.out.println("Ездили - " + driversFromCar);
        System.out.println("\nОтчёт по водителям:");
        List<String> inactiveDrivers = new ArrayList<>();

        for (String driver : drivers) {
            if (!driversFromCar.contains(driver)) {
                inactiveDrivers.add(driver);
            }
        }
        System.out.println("Не ездили - " + inactiveDrivers);

        //второй способ
        System.out.println();
        //сначала просто с драйверс, потом чтобы его не изменять, скопировать в инэктивДрайверс
        inactiveDrivers.clear();
        inactiveDrivers.addAll(drivers);
        inactiveDrivers.removeAll(driversFromCar);
        System.out.println("Не ездили - " + inactiveDrivers);

    }
}
