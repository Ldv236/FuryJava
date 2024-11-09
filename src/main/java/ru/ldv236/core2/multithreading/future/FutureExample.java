package ru.ldv236.core2.multithreading.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            // Некоторая длительная задача
            Thread.sleep(1000);
            return 42;
        });

        try {
            Integer result = future.get(); // get блокирует основной поток до завершения задачи
            System.out.println("Результат: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
