package ru.ldv236.core2.multithreading.base;

import java.util.concurrent.*;

public class threads6CallableFuture {
//    У экзекьюторов есть ещё одно преимущество перед созданием потоков вручную.
//    Это возможность отследить статус задачи и получить результат:
//
//  Заворачиваем задачу в интерфейс Callable
//  Отправляем в экзекьютор
//  Получаем объект Future для отслеживания результата
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newCachedThreadPool();

        Callable<Integer> c = () -> {
            return 12*15;
        };

        Future<Integer> res = executor.submit(c); // отправляем задачу в экзекьютор
        Integer value = res.get();                // забираем результат вычислений
        System.out.println(value);
//        Зачем нужен посредник в виде Future?
//        Почему бы экзекьютору не вернуть результат как есть? Вот так:
//        Integer res = executor.submit(() -> 12*15);
//
//        Ответ: чтобы записать результат в переменную, надо дождаться пока задача завершится.
//        Теряется весь смысл отправки задачи в другой поток. Если приходится ждать результат
//        прямо сейчас, код выше равноценен последовательному выполнению
    }
}
