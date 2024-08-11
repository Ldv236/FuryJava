package ru.runo.Incapsulation;

public class Clock {
    // Закрытые поля для хранения времени
    private int hour;   // от 0 до 23
    private int minute; // от 0 до 59

    // Конструктор по умолчанию, инициализирующий часы полночью
    public Clock() {
        this.hour = 0;
        this.minute = 0;
    }

    // (Можно писать только чтобы добить время) Конструктор, принимающий начальные значения времени
    public Clock(int hour, int minute) {
        setHour(hour);
        setMinute(minute);
    }

    // Геттер для получения текущего часа
    public int getHour() {
        return hour;
    }

    // Геттер для получения текущей минуты
    public int getMinute() {
        return minute;
    }

    // Метод для получения времени в формате строки
    public String getTime() {
        return String.format("%02d:%02d", hour, minute);
    }

    // Сеттер для установки часа с валидацией
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }

    // Сеттер для установки минут с валидацией
    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }
    }


}
