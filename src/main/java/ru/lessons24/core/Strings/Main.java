package ru.lessons24.core.Strings;

public class Main {
    public static void main(String[] args) {
        // Сравнение, пул строк
        // Создание строки с помощью литерала
        String sL1 = "Hello";
        String sL2 = "Hello";

        // Создание строки с помощью конструктора
        String sC1 = new String("Hello");
        String sC2 = new String("Hello");

        // Сравнение строк с использованием ==
        System.out.println("sL1 == sL2 : " + (sL1 == sL2)); // true
        System.out.println("sC1 == sC2 : " + (sC1 == sC2)); // false
        System.out.println("sL1 == sC1 : " + (sL1 == sC1)); // false

        // Сравнение строк с использованием equals()
        System.out.println("sL1.equals(sL2) : " + sL1.equals(sL2)); // true
        System.out.println("sC1.equals(sC2) : " + sC1.equals(sC2)); // true
        System.out.println("sL1.equals(sC1) : " + sL1.equals(sC1)); // true

        // Применение метода intern()
        sC1 = sC1.intern();
        // Сравнение после применения intern()
        System.out.println("sL1 == strInterned : " + (sL1 == sC1)); // true



        // ИММУТАБЕЛЬНОСТЬ
        // Создаем строку с помощью литерала
        String str = "Hello";
        // Выводим первоначальное значение строки
        System.out.println("Initial value of str: " + str); // Output: Hello
        // Попытка изменить строку с использованием метода concat
        String newStr = str.concat(" World");
        // Выводим значение строки после применения метода concat
        System.out.println("Value of str after concat: " + str); // Output: Hello
        // Выводим значение новой строки, созданной методом concat
        System.out.println("Value of newStr: " + newStr); // Output: Hello World
        // Повторное присваивание str новой строки
        str = newStr;
        // Выводим окончательное значение строки str
        System.out.println("Final value of str: " + str); // Output: Hello World




        // РАЗНЫЕ МЕТОДЫ
        str = "Hello, World!";

        // 1. length() - Возвращает длину строки
        int length = str.length();
        System.out.println("Length of the string: " + length); // Output: 13

        // 2. charAt(int index) - Возвращает символ по указанному индексу
        char charAt = str.charAt(7);
        System.out.println("Character at index 7: " + charAt); // Output: W

        // 3. indexOf(String str) - Возвращает индекс первого вхождения подстроки
        int indexOf = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOf); // Output: 7

        // 5. equalsIgnoreCase(String another) - Сравнивает строки без учета регистра
        String anotherStr = "hello, world!";
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(anotherStr);
        System.out.println("Strings are equal ignoring case: " + isEqualIgnoreCase); // Output: true


        // КЛАССЫ-ОБЕРТКИ    WRAPPER
        int number = 10;
        Integer intWrapper = number;
        System.out.println(intWrapper);

        int newNumber = intWrapper;
        System.out.println(newNumber);

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("maxInt: " + maxInt + ", minInt: " + minInt);

        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        double parsedDouble = Double.parseDouble(numStr);
        System.out.println("Parsed int: " + parsedInt + ", Parsed double: " + parsedDouble);
    }
}
