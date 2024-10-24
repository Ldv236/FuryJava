package ru.ldv236.OOP.lesson6OopPrincipl.incapsulation;

public class Me {

    private Clock myClock; // Объект класса Clock

    public Me(Clock clock) {
        this.myClock = clock;
    }

    // Метод для изменения времени на часах
    public void changeTime(String newTime) {
        myClock.setTime(newTime);
    }

    // Метод для просмотра текущего времени на часах
    public String viewTime() {
        return myClock.getTime();
    }
}
