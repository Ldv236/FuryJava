package ru.ldv236.core2.enums.days;

// 1. Enum с полями, конструктором и методами
public enum DayOfWeek {
    MONDAY("Понедельник", true),
    TUESDAY("Вторник", true),
    WEDNESDAY("Среда", true),
    THURSDAY("Четверг", true),
    FRIDAY("Пятница", true),
    SATURDAY("Суббота", false),
    SUNDAY("Воскресенье", false);

    // Поля enum
    private final String russianName;
    private final boolean isWorkDay;

    // Конструктор для полей
    DayOfWeek(String russianName, boolean isWorkDay) {
        this.russianName = russianName;
        this.isWorkDay = isWorkDay;
    }

    // Геттеры для получения информации
    public String getRussianName() {
        return russianName;
    }

    public boolean isWorkDay() {
        return isWorkDay;
    }

    // Статический метод для поиска дня по русскому названию
    public static DayOfWeek fromRussianName(String name) {
        for (DayOfWeek day : values()) {
            if (day.getRussianName().equalsIgnoreCase(name)) {
                return day;
            }
        }
        throw new IllegalArgumentException("Нет дня недели с именем: " + name);
    }

    @Override
    public String toString() {
        return this.name() + " (" + russianName + "), рабочий день: " + (isWorkDay ? "Да" : "Нет");
    }
}
