package ru.ldv236.patterns.other.callBack;

public class TaskExecutor {

    public void executeTask(TaskListener listener) {
        System.out.println("Executing task...");

        // Имитация выполнения задачи
        try {
            Thread.sleep(1000);  // Например, выполнение задачи занимает 1 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task finished!");

        // Вызов метода интерфейса (колбэка) после завершения задачи
        listener.onTaskCompleted();
    }
}
