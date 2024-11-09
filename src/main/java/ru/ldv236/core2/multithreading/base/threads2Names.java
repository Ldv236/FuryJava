package ru.ldv236.core2.multithreading.base;

public class threads2Names {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new CustomThread();
        thread.run(); // при вызове ран (а не старт) просто выполняется метод, без создания нового потока
        thread.start();
        Thread.sleep(1000);
        thread.run();
//        thread.start();
    }
}

class CustomThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}