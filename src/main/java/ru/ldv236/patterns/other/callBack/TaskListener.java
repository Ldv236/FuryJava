package ru.ldv236.patterns.other.callBack;

// Интерфейс обратного вызова (колбэк)
public interface TaskListener {
    void onTaskCompleted();  // Метод, который будет вызван при завершении задачи
}