package ru.lessons24.core.Strings;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome();
        isPalindromeDigit();
    }

    static void isPalindrome() {
        // сначала простое слово в одном регистре
        String str = "A man, a plan, a canal: Panama"; // Пример строки
        // Приведение к нижнему регистру и удаление всех символов, кроме букв и цифр
        String cleanedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = cleanedStr.length() - 1;
        boolean isPalindrome = true;

        // Проверка на палиндром
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static void isPalindromeDigit() {
        int number = 12321;
        int originalNumber = number;
        int reversedNumber = 0;

        // Переворачиваем число
        while (number != 0) {
            int digit = number % 10; // Получаем последнюю цифру
            reversedNumber = reversedNumber * 10 + digit; // Добавляем цифру в перевёрнутое число
            number /= 10; // Убираем последнюю цифру из числа
        }

        // Сравниваем исходное число с перевёрнутым
        if (originalNumber == reversedNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
