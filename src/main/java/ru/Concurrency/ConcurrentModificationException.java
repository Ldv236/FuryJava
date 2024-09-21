package ru.Concurrency;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        Runnable task1 = () -> {
//            for (int i = 0; i < list.size(); i++) {
//                System.out.print(list.get(i) + " ");
//            }
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        };

        Runnable task2 = () -> {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            list.remove(0);
        };

        Thread asya = new Thread(task1);
        Thread kir = new Thread(task2);
        asya.start();
        kir.start();
    }
}
