package ru.ldv236.core.chars;

public class Main {
        public static void checkCharacters(String input) {
            if (input.toLowerCase().endsWith("#")) {
                System.out.println("ugu");
            }

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isDigit(ch)) {
                    System.out.println(ch + " - Цифра");
                } else if (Character.isLetter(ch)) {
                    System.out.println(ch + " - Буква");
                } else {
                    System.out.println(ch + " - Специальный символ");
                }
            }
        }

        public static void main(String[] args) {
            String testString = "abc123!@#";
            checkCharacters(testString);
        }
    }
