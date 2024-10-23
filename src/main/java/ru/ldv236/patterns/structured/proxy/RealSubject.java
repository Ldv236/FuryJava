package ru.ldv236.patterns.structured.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Выполняется запрос RealSubject");
    }
}