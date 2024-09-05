package ru.lessons24.OOP.GC;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creating objects...");

        // после того как увидели как все объекты собираются, некоторые из них сложим в массив, чтобы уберечь
        GarbageCollectionDemo[] garbageCollectionDemos = new GarbageCollectionDemo[50];

        // Создаем объекты в цикле, чтобы они стали кандидатами для удаления
        for (int i = 1; i <= 10; i++) {
            // сначала просто такая строка, все объекты собираются
//            new GarbageCollectionDemo(i);
            //потом вводим условие и кладем в массив, опять смотрим - половина объектов уцелела, ахуенчик

            if (i % 2 == 0) {
                garbageCollectionDemos[i] = new GarbageCollectionDemo(i);
            } else {
                new GarbageCollectionDemo(i);
            }
        }

        // Явный запрос на сборку мусора
        System.out.println("Requesting garbage collection...");
        System.gc();  // Запрашиваем сборку мусора

        // Задержка, чтобы дать время сборщику мусора сработать
        try {
            Thread.sleep(2000);  // Спим 2 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}
