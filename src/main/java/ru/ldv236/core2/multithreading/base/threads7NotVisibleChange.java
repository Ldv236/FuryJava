package ru.ldv236.core2.multithreading.base;

public class threads7NotVisibleChange {
// Проблема №3: потоки не видят изменений, сделанных другими потоками
// Также эту проблему называют "проблема видимости".
// Перейдём к примеру. Двум потокам доступна переменная value.
// Один поток её увеличивает, другой следит за изменениями:

    public /*volatile*/ static int value;

    public static void main(String[] args) {

        // Читаем значение переменной
        Thread reader = new Thread(() -> {
            int temp = 0;
            while (true) {
                if (temp != value) {
                    temp = value;
                    System.out.println("read value = " + value);
                }
            }
        });
        reader.setDaemon(true); // чтобы завершить программу после выполнения writer

        // Обновляем значение переменной
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                value++;
                System.out.println("value updated: " + value);
                try {
                    Thread.sleep(1000); // + try-catch
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            // Немного ждём
            try {
                Thread.sleep(5000); // + try-catch
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        reader.start();
        writer.start();
    }
}
