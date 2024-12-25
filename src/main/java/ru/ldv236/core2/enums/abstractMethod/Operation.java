package ru.ldv236.core2.enums.abstractMethod;


// 2. Enum с абстрактным методом
enum Operation {
    ADDITION {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICATION {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVISION {
        @Override
        public double apply(double x, double y) {
            if (y == 0) throw new ArithmeticException("Деление на ноль!");
            return x / y;
        }
    };

    // Абстрактный метод, который будет реализован каждым значением
    public abstract double apply(double x, double y);
}