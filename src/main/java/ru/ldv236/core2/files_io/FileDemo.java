package ru.ldv236.core2.files_io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String fileName = "example.txt";
//        String filePath = fileName; // в корне проекта
//        String filePath = "files/" + fileName; // в папке в корне проекта
        String filePath = "src/main/java/ru/ldv236/core2/files_io/" + fileName; // вместе с примером кода
//        String filePath = "C:/files/" + fileName; //абсолютный путь

        // === 1. Запись текста в файл ===
        writeToFile(filePath, "Привет, мир!\nЭто демонстрация работы с файлами в Java.");


        // === 2. Чтение текста из файла ===
        readFromFile(filePath);

        // === 3. Добавление текста в файл ===
        appendToFile(filePath, "\nДобавляем новую строку в файл.");

        // === 4. Чтение файла построчно (новый способ через NIO) ===
        readLinesUsingNio(filePath);

        // === 5. Удаление файла ===
        deleteFile(filePath);
    }

//    Используется BufferedWriter и FileWriter.
//    Содержимое перезаписывается, если файл уже существует.
//            Метод try-with-resources автоматически закрывает файл после записи.
//    Ключевые классы:
//    BufferedWriter — буферизует текст, чтобы минимизировать операции записи.
//            FileWriter — поток для записи символов в файл.
    /**
     * 1️⃣ Запись текста в файл. Содержимое файла будет перезаписано.
     *
     * @param filePath Путь к файлу
     * @param content  Содержимое, которое нужно записать в файл
     */
    public static void writeToFile(String filePath, String content) {
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(filePath);
//            writer.write("Привет, это текст, записанный в файл без try-with-resources.\n");
//            writer.write("Здесь ресурсы будут закрыты вручную.");
//            System.out.println("✅ Данные успешно записаны в файл: " + filePath);
//        } catch (IOException e) {
//            System.err.println("❌ Ошибка при записи файла: " + e.getMessage());
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                    System.out.println("✅ FileWriter закрыт.");
//                } catch (IOException e) {
//                    System.err.println("❌ Ошибка при закрытии FileWriter: " + e.getMessage());
//                }
//            }
//        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("✅ Файл успешно создан и записан: " + filePath);
        } catch (IOException e) {
            System.err.println("❌ Ошибка при записи файла: " + e.getMessage());
        }
    }

//    Используется BufferedReader и FileReader.
//    Метод readLine() считывает файл построчно.
//    Ключевые классы:
//    BufferedReader — считывает текст буферизировано (минимизирует операции чтения).
//    FileReader — поток для чтения символов из файла.
    /**
     * 2️⃣ Чтение текста из файла и вывод на экран.
     *
     * @param filePath Путь к файлу
     */
    public static void readFromFile(String filePath) {
        System.out.println("\n📘 Содержимое файла " + filePath + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("❌ Ошибка при чтении файла: " + e.getMessage());
        }
    }

//    Отличие от writeToFile — используется new FileWriter(filePath, true), где true означает режим добавления.
//    Это позволяет добавить текст в конец файла, не удаляя существующее содержимое.
    /**
     * 3️⃣ Добавление текста в существующий файл.
     *
     * @param filePath Путь к файлу
     * @param content  Содержимое, которое нужно добавить в файл
     */
    public static void appendToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(content);
            System.out.println("\n✅ Данные добавлены в файл: " + filePath);
        } catch (IOException e) {
            System.err.println("❌ Ошибка при добавлении текста в файл: " + e.getMessage());
        }
    }

//    Files.readAllLines(Path.of(filePath)) читает все строки файла и возвращает их как List<String>.
//    Этот способ проще и удобнее, чем BufferedReader, но он загружает весь файл в память.
//    Ключевые классы:
//    Files — класс с утилитами для работы с файлами и каталогами.
//            Path.of() — создание пути к файлу в стиле NIO.
    /**
     * 4️⃣ Чтение файла построчно через NIO (Files.readAllLines).
     *
     * @param filePath Путь к файлу
     */
    public static void readLinesUsingNio(String filePath) {
        System.out.println("\n📘 Чтение файла с использованием Files.readAllLines:");
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("❌ Ошибка при чтении файла с использованием NIO: " + e.getMessage());
        }
    }

//    Метод Files.deleteIfExists(Path.of(filePath)) удаляет файл, если он существует.
//    В отличие от Files.delete(), этот метод не выбросит исключение, если файл не существует.
//    Ключевые классы:
//    Files — предоставляет методы для работы с файлами, включая удаление, копирование и перемещение.
//            Path — объект, представляющий путь к файлу или каталогу.
    /**
     * 5️⃣ Удаление файла.
     *
     * @param filePath Путь к файлу
     */
    public static void deleteFile(String filePath) {
        try {
            Files.deleteIfExists(Path.of(filePath));
            System.out.println("\n🗑️ Файл успешно удалён: " + filePath);
        } catch (IOException e) {
            System.err.println("❌ Ошибка при удалении файла: " + e.getMessage());
        }
    }
}
