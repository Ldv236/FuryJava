package ru.ldv236.core2.multithreading.base;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threads5Executor {
    public static void main(String[] args) throws InterruptedException {
        //пул с одним потоком (это потом)
//        ExecutorService executor = Executors.newSingleThreadExecutor();
        //пул с одним фиксированным числом потоков (это потом)
//        ExecutorService executor = Executors.newFixedThreadPool(10);
        //пул с динамическим количеством потоком (начинаем с этого)
        ExecutorService executor = Executors.newCachedThreadPool();

        // сначала одну отправляем задачу:
//        Runnable task = () -> {
//            int result = 12*15;
//            updateValue(result);
//        };
//        // сабмит принимает функциональный интерфейс раннебл
//        executor.submit(task);

        // потом сразу много и смотрим порядок выполнения
//        for (int i = 0; i < 10; i++) {
//            final int value = i;
//            executor.submit(() -> System.out.println(value));
//        }

        // потом опять и смотрим имена потоков
//        for (int i = 0; i < 10; i++) {
//            final int value = i;
//            executor.submit(() -> System.out.println(Thread.currentThread().getName() + " - " + value));
//        }

        // программа заканчивается когда останавливаются потоки, а они останавливаются после минуты бездействия
        // потом опять и собираем статистику по количества тасок каждым потоком
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 50; i++) {
            executor.submit(() -> {
                String name = Thread.currentThread().getName();
                map.put(name, map.getOrDefault(name, 0) + 1);
            });
        }
        Thread.sleep(500);
        map.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("thread count - " + map.size());
    }

    public static void updateValue(int value) {
        System.out.println("Updated value: " + value);

    }
}
