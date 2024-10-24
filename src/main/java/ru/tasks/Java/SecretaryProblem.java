package ru.tasks.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecretaryProblem {
    public static void main(String[] args) {
        int countIter = 10000000;
        List<Boolean> boolList = new ArrayList<>(countIter);
        for (int i = 0; i < countIter; i++) {
            boolList.add(dododo());
        }
        System.out.println(boolList.stream().filter(b -> b.equals(true)).count() + " find Max Value from " + countIter);
    }

    static boolean dododo () {
        List<Integer> list = new ArrayList<>();
        int countElements = 100;
        int maxValue = countElements - 1;
        int countMissElement = (int) (countElements / 2.7);
//        System.out.println(countMissElement);
        int foundMaxMissed = 0;
        int foundBest = 0;

        for (int i = 0; i < countElements; i++) {
            list.add(i);
        }
//        System.out.println(list);
        Collections.shuffle(list);
//        System.out.println(list);

        for (int i = 0; i < countElements; i++) {
            if (i < countMissElement) {
                foundMaxMissed = Math.max(foundMaxMissed, list.get(i));
            } else if (list.get(i) > foundMaxMissed) {
                foundBest = list.get(i);
                break;
            } else if (i == countElements - 1) {
                foundBest = list.get(i);
            }
        }
//        System.out.println(foundBest);
        return maxValue == foundBest;
    }
}
