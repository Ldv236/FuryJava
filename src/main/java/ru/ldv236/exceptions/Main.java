package ru.ldv236.exceptions;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer randomInt = random.nextInt();

        try {
            if (randomInt < 0) {
                throw new IllegalArgumentException();
            } else {
                throw new IllegalStateException();
            }
        } catch (Exception e) {
            System.out.println(randomInt + ", поймано - " + e.getClass());
        }
    }
}