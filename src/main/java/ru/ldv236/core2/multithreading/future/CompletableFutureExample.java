package ru.ldv236.core2.multithreading.future;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            // Некоторая длительная задача
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 42;
        });

        future.thenApply(result -> result * 2)   // thenApply — преобразует результат и возвращает новый CompletableFuture
                .thenAccept(result -> System.out.println("Результат: " + result)) // thenAccept — выполняет действие над результатом без его преобразования.
                .exceptionally(e -> { // Обработка ошибок
                    System.out.println("Ошибка: " + e.getMessage());
                    return null;
                });

        // Здесь основной поток не блокируется, и дальнейший код может выполняться
        System.out.println("Ожидание результата...");
    }
}
