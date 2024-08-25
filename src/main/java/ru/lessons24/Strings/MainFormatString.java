package ru.lessons24.Strings;

public class MainFormatString {
    public static void main(String[] args) {
        // ПРЕОБРАЗОВАНИЕ
        String helloString = "Hello, World!";

        // 4. substring(int beginIndex, int endIndex) - Возвращает подстроку
        String substring = helloString.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring); // Output: World

        // 6. toUpperCase() - Преобразует все символы строки в верхний регистр
        String upperCaseStr = helloString.toUpperCase();
        System.out.println("String in uppercase: " + upperCaseStr); // Output: HELLO, WORLD!

        // 7. toLowerCase() - Преобразует все символы строки в нижний регистр
        String lowerCaseStr = helloString.toLowerCase();
        System.out.println("String in lowercase: " + lowerCaseStr); // Output: hello, world!

        // 8. replace(CharSequence target, CharSequence replacement) - Заменяет все вхождения подстроки
        String replacedStr = helloString.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replacedStr); // Output: Hello, Java!





        String name = "Alice";
        int age = 25;
        double salary = 1234.56;

        // 1. Конкатенация с использованием оператора +
        String concatenated = "Name: " + name + ", Age: " + age + ", Salary: " + salary;
        System.out.println("Concatenation: " + concatenated);
        // Output: Concatenation: Name: Alice, Age: 25, Salary: 1234.56

        // 2. Форматирование с использованием String.format()
        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println("String.format(): " + formattedString);
        // Output: String.format(): Name: Alice, Age: 25, Salary: 1234.56

        // 3. Форматирование с использованием helloString.formatted()
        String template = "Name: %s, Age: %d, Salary: %.2f";
        String formattedUsingTemplate = template.formatted(name, age, salary);
        System.out.println("formatted(): " + formattedUsingTemplate);
        // Output: formatted(): Name: Alice, Age: 25, Salary: 1234.56




        String input = "  Hello,   World! 123   ";
        // 1. Удаление лишних пробелов (удаление пробелов в начале, конце и сокращение всех пробелов до одного)
        String trimmed = input.trim(); // удаляем пробелы в начале и конце
        String normalizedSpaces = trimmed.replaceAll("\\s+", " "); // заменяем несколько пробелов одним
        System.out.println("Normalized spaces: " + normalizedSpaces); // Output: "Hello, World! 123"

        // 2. Удаление всех символов, кроме букв и пробелов
        String lettersAndSpacesOnly = normalizedSpaces.replaceAll("[^a-zA-Z\\s]", "");
        System.out.println("Letters and spaces only: " + lettersAndSpacesOnly); // Output: "Hello World"



        String result = "";
        for (int i = 0; i < 5; i++) {
            result += "Iteration" + i + " ";
        }
        System.out.println("Result with concatenation: " + result);
        // Output: Result with concatenation: Iteration 0 Iteration 1 Iteration 2 Iteration 3 Iteration 4

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("Iteration").append(i).append(" ");
        }
        result = sb.toString();
        System.out.println("Result with StringBuilder: " + result);
        // Output: Result with StringBuilder: Iteration 0 Iteration 1 Iteration 2 Iteration 3 Iteration 4
    }
}
