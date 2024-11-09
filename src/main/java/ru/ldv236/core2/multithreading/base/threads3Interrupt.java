package ru.ldv236.core2.multithreading.base;

public class threads3Interrupt {
    public static void main(String[] args) {

        Runnable task1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("task1 - " + i);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
        };


        Thread threadForTask1 = new Thread(task1);
        threadForTask1.start();
        threadForTask1.interrupt();
    }
}
