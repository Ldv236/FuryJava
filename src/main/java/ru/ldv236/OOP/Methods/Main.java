package ru.ldv236.OOP.Methods;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Car toyota = new Car();
        toyota.model = "Toyota";
        toyota.color = "Blue";
        toyota.year = 2016;

        //это сделать после введения варагс и ручной передачи нескольких параметров, мол хз сколько их будет
        Random rand = new Random();
        int arraySize = rand.nextInt(3, 10);
        int[] speeds = new int[arraySize];

        for (int i = 0; i < speeds.length; i++) {
            speeds[i] = rand.nextInt(120);
        }

        toyota.start();
        toyota.ride();
        toyota.ride(10);
        //добавить много параметров
//        toyota.ride(50,100, 60, 20);

//        toyota.ride(speeds);
//        toyota.stop();
//        System.out.println("Поездка прошла хорошо");

        //после выпадения исключений и падения программы добавить жавадок, секцию тровс в метод и трай-кетч
        try {
            toyota.ride(speeds);
            System.out.println("Поездка прошла хорошо");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            //даже если пробрасываем исключение дальше, файнали выполняется
//            throw new RuntimeException(e.getMessage(), e);
        } finally { //и добавить файналли, рассказав о нём (перенеся "прошла хорошо" в трай, а стоп в файналли
            toyota.stop();
        }
    }
}
