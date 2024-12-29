package ru.ldv236.core2.enums.abstractMethod;


// 2. Enum с абстрактным методом
enum Operation {
    ADDITION('+') {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBSTRACTION('-') {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLICATION('*') {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVISION('/') {
        @Override
        public double apply(double x, double y) {
            if (y == 0) throw new ArithmeticException("Деление на ноль!");
            return x / y;
        }
    },
    POWER('^') {
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    };

    private final char symbol;

    Operation(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    // Абстрактный метод, который будет реализован каждым значением
    public abstract double apply(double x, double y);
}