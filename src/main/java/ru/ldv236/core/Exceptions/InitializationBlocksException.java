package ru.ldv236.core.Exceptions;

import java.util.Scanner;

public class InitializationBlocksException {
        static Scanner sc = new Scanner(System.in);
        static Integer input;

    static {
        System.out.println("Действие в статическом блоке инициализации");
        input = Integer.parseInt(sc.nextLine());
    }

    {
        System.out.println("Действие в НЕстатическом блоке инициализации");
        input = Integer.parseInt(sc.nextLine());
    }
}
