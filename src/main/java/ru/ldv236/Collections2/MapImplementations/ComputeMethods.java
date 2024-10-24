package ru.ldv236.Collections2.MapImplementations;

import java.util.HashMap;
import java.util.Map;

public class ComputeMethods {
    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();
//        Map<String, Integer> fruitMap = new LinkedHashMap<>();
//        Map<String, Integer> fruitMap = new TreeMap<>();

        fruitMap.put("Banana", 15);
        fruitMap.put("Apple", 10);
        fruitMap.put("Orange", 20);
        System.out.println(fruitMap);

        // computeIfAbsent - вычислить если отсутствует
        //бананы есть, поэтому ничего не меняется
        fruitMap.computeIfAbsent("Banana", k -> 999);
        System.out.println(fruitMap);
        //кваса не было, поэтому он добавляется с указанным значением
        fruitMap.computeIfAbsent("Kvas", k -> 999);
        System.out.println(fruitMap);

        // похоже, но без вычисления с помощью функции, просто значение
        // бананы уже есть, игнор
        fruitMap.putIfAbsent("Banana", 99);
        System.out.println(fruitMap);
        // каштанов нет -> добавляются
        fruitMap.putIfAbsent("Kashtany", 88);
        System.out.println(fruitMap);

        // computeIfPresent - вычислить если присутствует
        //бананы есть, поэтому их колчество увеличивается на 10
        fruitMap.computeIfPresent("Banana", (k, v) -> v + 10);
        System.out.println(fruitMap);
        //печенек нет, поэтому ничего не происходит
        fruitMap.computeIfPresent("Cookies", (k, v) -> v + 10);
        System.out.println(fruitMap);

        // compute - вычислить
        //бананы есть, поэтому их колчество увеличивается на 10
        fruitMap.compute("Banana", (k, v) -> v + 10);
        System.out.println(fruitMap);
        //хрючева нет, поэтому ничего не происходит
        fruitMap.compute("Khruchevo", (k, v) -> k.length());
        System.out.println(fruitMap);

        // merge - слияние
        //бананы есть, поэтому новое и старое значение складываются (или еще как-то сливаются для получения итога)
        fruitMap.merge("Banana", 10, (oldV, newV) -> oldV + newV);
        System.out.println(fruitMap);
        //кетчунеза нет, поэтому он добавляется с указанным значением
        fruitMap.merge("Ketchunez", 10, (oldV, newV) -> oldV + newV);
        System.out.println(fruitMap);
    }
}
