package ru.ldv236.patterns.creational.builderBloch;

public class ProductPackaging {

    // Обязательные параметры
    private final double proteins; // Белки
    private final double fats;     // Жиры
    private final double carbs;    // Углеводы

    // Необязательные параметры
    private final double calories; // Калорийность
    private final double weight;   // Вес продукта

    /*сначала можно показать просто как конструктор может принимать
    не конкретные параметры, а сразу объект
    после этого перейти в Миро на схему про билдер*/
    // Приватный конструктор, доступный только билдеру
    private ProductPackaging(Builder builder) {
        this.proteins = builder.proteins;
        this.fats = builder.fats;
        this.carbs = builder.carbs;
        this.calories = builder.calories;
        this.weight = builder.weight;
    }

    // Статический вложенный класс Builder
    public static class Builder {
        // Обязательные параметры
        private final double proteins;
        private final double fats;
        private final double carbs;

        // Необязательные параметры инициализируем значениями по умолчанию
        private double calories = 0;
        private double weight = 0;

        // Конструктор Builder'а с обязательными параметрами
        public Builder(double proteins, double fats, double carbs) {
            this.proteins = proteins;
            this.fats = fats;
            this.carbs = carbs;
        }

        // Методы для установки необязательных параметров
        public Builder calories(double calories) {
            this.calories = calories;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        // Метод для создания экземпляра ProductPackaging
        public ProductPackaging build() {
            return new ProductPackaging(this);
        }
    }

    // Геттеры для доступа к полям класса
//    public double getProteins() {
//        return proteins;
//    }
//
//    public double getFats() {
//        return fats;
//    }
//
//    public double getCarbs() {
//        return carbs;
//    }
//
//    public double getCalories() {
//        return calories;
//    }
//
//    public double getWeight() {
//        return weight;
//    }

    @Override
    public String toString() {
        return "ProductPackaging{" +
                "proteins=" + proteins +
                ", fats=" + fats +
                ", carbs=" + carbs +
                ", calories=" + calories +
                ", weight=" + weight +
                '}';
    }
}
