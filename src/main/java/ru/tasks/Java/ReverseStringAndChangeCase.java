package ru.tasks.Java;

public class ReverseStringAndChangeCase {

    public static String transformString(String input) {
        if (input == null || input.isBlank()) {
            return ""; // Если строка пустая или null
        }

        // Переворачиваем всю строку
        String reversed = new StringBuilder(input).reverse().toString();

        // мой способ без разбивки строки на массив слов
        StringBuilder result = new StringBuilder();
        boolean isNeedToUpper = true;
        for (int i = 0; i < reversed.length(); i++) {
            if (isNeedToUpper) {
                result.append(Character.toUpperCase(reversed.charAt(i)));
                isNeedToUpper = false;
            } else if (reversed.charAt(i) == ' ') {
                result.append(reversed.charAt(i));
                isNeedToUpper = true;
            } else {
                result.append(Character.toLowerCase(reversed.charAt(i)));
            }
        }

        // способ от жпт с разбивкой на слова, доп.методом и трим() в конце
//        // Разбиваем строку на слова
//        String[] words = reversed.split("\\s+");
//        StringBuilder result = new StringBuilder();
//
//        for (String word : words) {
//            // Делаем первую букву заглавной, остальные строчными
//            String transformedWord = capitalizeFirstLetter(word);
//            result.append(transformedWord).append(" ");
//        }
//
//        // Убираем лишний пробел в конце
//        return result.toString().trim();
        return result.toString();
    }

//    private static String capitalizeFirstLetter(String word) {
//        if (word.isEmpty()) {
//            return word; // Если слово пустое
//        }
//        // Первая буква заглавная, остальные строчные
//        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
//    }

    public static void main(String[] args) {
        String input = "Иванов Иван Иванович";
        String transformed = transformString(input);
        System.out.println(transformed);
        // Ожидается: "Чивонав Вани Вонавини"
    }
}
