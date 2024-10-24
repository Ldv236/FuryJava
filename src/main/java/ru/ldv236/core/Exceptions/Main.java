package ru.ldv236.core.Exceptions;

public class Main {
    public static void main(String[] args) {
        // Пример 1: Обработка исключения ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            int invalidIndexValue = numbers[5]; // Попытка доступа к несуществующему индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            // Output: ArrayIndexOutOfBoundsException caught: Index 5 out of bounds for length 3
        }

        // Пример 2: Обработка исключения NullPointerException при работе с массивом
        try {
            int[] numbers = null;
            int firstValue = numbers[0]; // Попытка доступа к элементу массива, который равен null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
            // Output: NullPointerException caught: Cannot read the array length because "numbers" is null
        }

        // Пример 3: Обработка исключения ArithmeticException при делении на ноль
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            // Output: ArithmeticException caught: / by zero
        }

        // Пример 4: Объединение нескольких обработчиков исключений
        try {
            int[] numbers = {1, 2, 3};
            int invalidIndexValue = numbers[5]; // Попытка доступа к несуществующему индексу

            int a = 10;
            int b = 0;
            int result = a / b; // Деление на ноль
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            // Обработка других возможных исключений
            System.out.println("General exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed."); // Этот блок всегда выполняется
            // Output: This block is always executed.
        }



        int age = -5;

        try {
            validateAge(age);
//        } catch (IllegalArgumentException e) {
        } catch (BadAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Output: Exception caught: Age cannot be negative
        }
    }

    // Метод для проверки возраста
    public static void validateAge(int age) {
        if (age < 0) {
//            throw new IllegalArgumentException("Age cannot be negative");
            throw new BadAgeException("Age cannot be negative");
        }
        System.out.println("Возраст проверен: " + age);
    }
}
