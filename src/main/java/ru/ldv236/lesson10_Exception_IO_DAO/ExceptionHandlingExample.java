package ru.ldv236.lesson10_Exception_IO_DAO;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingExample {

    // Метод для чтения файла, который может генерировать FileNotFoundException
    public void readFile(String filePath) throws FileNotFoundException {
        FileReader fileReader = new FileReader(filePath);
        // Логика для чтения из файла
        System.out.println("Файл успешно открыт для чтения.");
    }
}
