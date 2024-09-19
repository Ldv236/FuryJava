package ru.lessons24.OOP.Homework;

public class ServiceStation {
    public static void serviceTransport(Transport transport){
        System.out.println("***** Начинаем обслуживание *****");
        transport.service();
    }
}
