package ru.ldv236.patterns.builder;

// Шаг 1: Создаем класс Дома
class House {
    private int floors;
    private boolean hasGarden;
    private boolean hasGarage;

    // Конструктор приватный, чтобы создание объекта было возможно только через Билдер
    private House(Builder builder) {
        this.floors = builder.floors;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", hasGarden=" + hasGarden +
                ", hasGarage=" + hasGarage +
                '}';
    }

    // Шаг 2: Внутренний статический класс Builder
    public static class Builder {
        private int floors;
        private boolean hasGarden;
        private boolean hasGarage;

        public Builder() {
        }

        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}