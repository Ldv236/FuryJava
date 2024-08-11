package ru.ldv236.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("Proxy preRequest: Подготовка к выполнению запроса.");
    }

    private void postRequest() {
        System.out.println("Proxy postRequest: Выполнение дополнительных действий после запроса.");
    }
}