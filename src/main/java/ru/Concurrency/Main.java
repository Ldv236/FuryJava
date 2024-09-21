package ru.Concurrency;

public class Main {
    public static void main(String[] args) {
        // Ася и Кир пишут на листочках цифры, но что если им придется писать на одном листочке и/или одной ручкой?
        Runnable task1 = () -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println("A - " + i);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 1; i <= 50; i++) {
                System.out.println("K - " + i);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };

        Thread asya = new Thread(task1);
        Thread kir = new Thread(task2);
        asya.start();
        kir.start();
    }
}
