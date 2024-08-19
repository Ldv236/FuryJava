package ru.runo.types;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // Целочисленные типы
        byte myByte = 100;           // 8 бит
        short myShort = 10_000;       // 16 бит
        int myInt = 100_000;          // 32 бита
        long myLong = 100_000_000L;    // 64 бита, суффикс L для обозначения long

        // Типы с плавающей точкой
        float myFloat = 3.14f;       // 32 бита, суффикс f для обозначения float
        double myDouble = 3.14159;   // 64 бита

        // Символьный тип
        char myChar = 'A';           // 16 бит, используется для символов

        // Логический тип
        boolean myBoolean = true;    // Логический тип, принимает значения true или false

        // Вывод значений
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);


        // Арифметические операции с целыми числами
        int a = 10;
        int b = 5;

        int sum = a + b;        // Сложение
        int difference = a - b; // Вычитание
        int product = a * b;    // Умножение
        int quotient = a / b;   // Деление
        int remainder = a % b;  // Остаток от деления

        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Остаток от деления: " + remainder);

        // Операции с плавающей точкой
        double x = 5.5;
        double y = 2.0;

        double sumD = x + y;
        double differenceD = x - y;
        double productD = x * y;
        double quotientD = x / y;

        System.out.println("Сложение (double): " + sumD);
        System.out.println("Вычитание (double): " + differenceD);
        System.out.println("Умножение (double): " + productD);
        System.out.println("Деление (double): " + quotientD);

        // Операции с символами
        char char1 = 'A';
        char char2 = 'B';

        int charSum = char1 + char2; // Сложение символов (их кодов Unicode)
        char nextChar = (char) (char1 + 1); // Получение следующего символа

        System.out.println("Сумма символов (как int): " + charSum);
        System.out.println("Следующий символ после 'A': " + nextChar);





        // ПРИВЕДЕНИЕ ТИПОВ !!!!!!!!!!11
        // Автоматическое (неявное) приведение типов
        int intVal = 100;
        long longVal = intVal; // int автоматически приводится к long
        double doubleVal = longVal; // long автоматически приводится к double

        System.out.println("intVal: " + intVal);
        System.out.println("longVal (автоматическое приведение): " + longVal);
        System.out.println("doubleVal (автоматическое приведение): " + doubleVal);

        // Явное приведение типов (сужение типа)
        double doubleValue = 9.78;
        int intFromDouble = (int) doubleValue; // Явное приведение double к int, дробная часть отбрасывается

        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intFromDouble (явное приведение): " + intFromDouble);

        // Приведение типов с потерей данных
        int largeInt = 150;
        byte byteVal = (byte) largeInt; // int явно приводится к byte, возможна потеря данных

        System.out.println("largeInt: " + largeInt);
        System.out.println("byteVal (явное приведение, с потерей данных): " + byteVal);

        // Приведение типов для работы с символами
        char charVal = 'A';
        int charToInt = charVal; // Автоматическое приведение char к int (код символа)
        char nextCharr = (char) (charVal + 1); // Явное приведение int к char

        System.out.println("charVal: " + charVal);
        System.out.println("charToInt (автоматическое приведение): " + charToInt);
        System.out.println("nextChar (явное приведение): " + nextCharr);






        // ПОТЕРЯ ТОЧНОСТИ !!!!!11
        // Создание объектов BigDecimal - способ 1
        BigDecimal aa = new BigDecimal("0.1");
        BigDecimal bb = new BigDecimal("0.2");
        // Выполнение сложения
        BigDecimal summ = aa.add(bb);
        // Вывод результата
        System.out.println("BigDecimal a: " + aa);
        System.out.println("BigDecimal b: " + bb);
        System.out.println("BigDecimal a + b = " + summ);
        // Деление с указанием масштаба и режима округления
        BigDecimal c = new BigDecimal("1.0");
        BigDecimal d = new BigDecimal("3.0");
        BigDecimal result = c.divide(d, 10, RoundingMode.HALF_UP); // Округление до 10 знаков после запятой
        System.out.println("BigDecimal 1.0 / 3.0 = " + result);


        // Спосбоб 2
        // Масштабируем числа перед выполнением арифметических операций
        double aaa = 0.1;
        double bbb = 0.2;
        // Умножаем числа на 1000 (масштабируем)
        int scaledA = (int) (aaa * 1000);
        int scaledB = (int) (bbb * 1000);
        // Складываем масштабированные значения
        int scaledSum = scaledA + scaledB;
        // Возвращаем результат обратно, делением на 1000
        double finalSum = scaledSum / 1000.0;
        // Вывод результата
        System.out.println("Масштабируемое сложение 0.1 + 0.2 = " + finalSum);

        // Другой пример - деление
        double xx = 1.0;
        double yy = 3.7;  // y теперь не является целым числом

        // Выбираем достаточно большой масштаб (например, 10^6)
        int scale = 1000000;

        // Масштабируем ТОЛЬКО x
        long scaledX = (long) (xx * scale);

        // Выполняем деление, используя масштабированные значения
        double resultt = (double) scaledX / yy;

        // Масштабируем обратно, чтобы получить результат
        double finalResult = resultt / scale;

        // Вывод результата
        System.out.println("Масштабируемое деление " + xx + " / " + yy + " = " + finalResult);
    }
}
