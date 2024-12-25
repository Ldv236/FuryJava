package ru.ldv236.core2.files_nio;

import java.nio.file.*;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Для создания файла используется метод Files.createFile().
//        Если файл уже существует, будет выброшено исключение FileAlreadyExistsException.

        try {
            Path filePath = Paths.get("example_nio.txt");
            Files.createFile(filePath);
            System.out.println("File created: " + filePath);
        } catch (FileAlreadyExistsException e) {
            System.out.println("File already exists.");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Для записи текста в файл можно использовать метод Files.write().
//        Он принимает объект Path и список строк (List<String> или массив байтов).

        try {
            Path filePath = Paths.get("example_nio.txt");
            List<String> lines = List.of("Hello, World!", "This is Java NIO.");
            Files.write(filePath, lines); // Записываем строки в файл
            Files.write(filePath, lines); // Записываем строки в файл (перезаписываются)
            System.out.println("File written: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Для добавления текста можно использовать метод Files.write()
//        с флагом StandardOpenOption.APPEND. Это позволяет дописывать текст в уже существующий файл.

        try {
            Path filePath = Paths.get("example_nio.txt");
            List<String> additionalLines = List.of("Another line", "Append mode in action.");
            Files.write(filePath, additionalLines, StandardOpenOption.APPEND); // Дописываем строки
            System.out.println("Text appended to file.");
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Для чтения текста из файла используются методы Files.readAllLines()
//        (читает файл в список строк) или Files.lines() (поток строк для больших файлов).
//      Пример чтения всего файла:
        try {
            Path filePath = Paths.get("example_nio.txt");
            List<String> lines = Files.readAllLines(filePath); // Читаем все строки

            String oneString = Files.readString(filePath); // читаем как одну целую строку
            System.out.println(oneString);

            lines.forEach(System.out::println); // Печатаем строки на консоль
        } catch (Exception e) {
            e.printStackTrace();
        }
//        Пример чтения файла через поток:
        try {
            Path filePath = Paths.get("example_nio.txt");
            try (Stream<String> lines = Files.lines(filePath)) { // Читаем файл через Stream
                lines.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Для удаления файла используется метод Files.delete() или Files.deleteIfExists().
        try {
            Path filePath = Paths.get("example_nio.txt");
            Files.deleteIfExists(filePath); // Удаляем файл, если он существует
            System.out.println("File deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            // operations with NIO !!!
            String fileName = "example_nio2.txt";
            // new dir
            Path oldPath = Paths.get(fileName);
            Files.createFile(oldPath);

            Path newDir = Path.of("newDirectory/");
            Path newDir2 = Path.of("newDirectory2/");
            Path newPath = Path.of("newDirectory/", fileName);
            Path newPath2 = Path.of("newDirectory2/", fileName);

            Files.createDirectories(newDir);
            Files.createDirectories(newDir2);
            // copy
            Files.copy(oldPath, newPath, StandardCopyOption.REPLACE_EXISTING);
            // move
            Files.move(oldPath, newPath2, StandardCopyOption.REPLACE_EXISTING);
            // exists
            System.out.println(Files.exists(oldPath));
            System.out.println(Files.exists(newPath));
            System.out.println(Files.exists(newPath2));


            //new file
            if (!Files.exists(oldPath)) {
                System.out.println("Files.exists(oldPath) - " + Files.exists(newPath) + " -> создаем его ");
                Files.createFile(oldPath);
            }

//            // other ways with Path
////            Path path = Path.of("D:", "Idea", "FuryJava", "src", "main", "java", "ru", "ldv236", "core2", "files", "example2.txt");
////            // Запись текста в файл
////            Files.writeString(path, "Привет, это новый текст через Files.writeString!");
////            // Чтение текста из файла
////            String content = Files.readString(path);
////            System.out.println("Содержимое файла: " + content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
