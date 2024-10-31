package ru.ldv236.OOP.practice3;

public class ServiceStation {
    public static void serviceTransport(Transport transport){
        System.out.println("***** Начинаем обслуживание *****");
        transport.service();
    }
}
