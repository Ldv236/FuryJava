package ru.ldv236.junitTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    //so-so tests style
    @Test
    void multiply() {
        // Positive result
        Assertions.assertEquals(6, calculator.multiply(2, 3));

        // Negative result
        Assertions.assertEquals(-6, calculator.multiply(-2, 3));

        // Zero
        Assertions.assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    void divide() {
        // Normal division
        Assertions.assertEquals(2.0, calculator.divide(4, 2));

        // Fractional result
        Assertions.assertEquals(2.5, calculator.divide(5, 2));

        // Division by zero
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        // or
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        Assertions.assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void isPositive() {
        // Positive number
        Assertions.assertTrue(calculator.isPositive(5));

        // Negative number
        Assertions.assertFalse(calculator.isPositive(-5));

        // Zero
        Assertions.assertFalse(calculator.isPositive(0));
    }



    //good test style Given-When-Then
    @Test
    void divide_DividingByZero_ThrowException() {
        // Given
        int numerator = 5;
        int denominator = 0;

        // When
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(numerator, denominator));

        // Then
        Assertions.assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    void divide_ValidInputs_ReturnCorrectQuotient() {
        // Given
        int numerator = 10;
        int denominator = 2;

        // When
        double result = calculator.divide(numerator, denominator);

        // Then
        Assertions.assertEquals(5.0, result);
    }

    @Test
//    void isPositive_PositiveNumber_ReturnTrue() {
    void shouldReturnTrueWhenNumberIsPositive() {
        // Given
        int number = 10;

        // When
        boolean isPositive = calculator.isPositive(number);

        // Then
        Assertions.assertTrue(isPositive);
    }

    @Test
    void isPositive_NegativeNumber_ReturnFalse() {
        // Given
        int number = -10;

        // When
        boolean isPositive = calculator.isPositive(number);

        // Then
        Assertions.assertFalse(isPositive);
    }
}