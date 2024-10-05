package ru.lessons24.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Сервер запущен на порту 8080...");

            while (true) {
                // Ожидаем подключения клиента
                Socket clientSocket = serverSocket.accept();
                System.out.println("Подключение клиента...");

                // Создаем потоки для чтения запроса и отправки ответа
                try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream())) {

                    // Читаем первую строку HTTP-запроса
                    String requestLine = in.readLine();
                    System.out.println("Получен запрос: " + requestLine);

                    // Проверяем, является ли запрос GET-запросом
                    if (requestLine != null && requestLine.startsWith("GET")) {
                        // Формируем простой HTTP-ответ
                        String httpResponse = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: text/html\r\n" +
                                "\r\n" +
                                "<h1>Hello from Simple Java Server!</h1>";

                        // Отправляем HTTP-ответ клиенту (браузеру)
                        out.write(httpResponse);
                        out.flush(); // Обязательно сбрасываем буфер, чтобы отправить данные
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
