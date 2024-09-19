package ru.lessons24.Collections1.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // из метода мейн вызовите несколько отдельных методов:
        // 1 метод - принимает два списка чисел (по три числа), объединяет их, сортирует и возвращает результат
        // результат выполнения метода нужно вывести в консоль
        //2 метод - принимает два списка String (по три строки), находит общие элементы и возвращает список с общими элементами
        // результат выполнения метода нужно вывести в консоль
        //3 метод - принимает список списков, считает общее количество элементов, возвращает это количество
        // результат выполнения метода нужно вывести в консоль

        // 1. Списки чисел для метода 1
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(3);
//        list1.add(1);
//        list1.add(5);
        List<Integer> list1 = List.of(3, 1, 5);
        List<Integer> list2 = List.of(4, 3, 2);
        List<Integer> mergedSortedList = mergeAndSortLists(list1, list2);
        System.out.println("Объединённый и отсортированный список чисел: " + mergedSortedList);

        // 2. Списки строк для метода 2
        List<String> strList1 = List.of("apple", "banana", "cherry");
        List<String> strList2 = List.of("banana", "cherry", "pineapple");
        List<String> commonStrings = findCommonElements(strList1, strList2);
        System.out.println("Общие элементы строк: " + commonStrings);

        // 3. Список списков для метода 3
        List<List<Integer>> listOfLists = new ArrayList<>();

        List<Integer> sublist1 = List.of(1, 2);
        List<Integer> sublist2 = List.of(5, 5, 4, 2);
        List<Integer> sublist3 = List.of(0);

        listOfLists.add(sublist1);
        listOfLists.add(sublist2);
        listOfLists.add(sublist3);

        int totalElements = countTotalElements(listOfLists);
        System.out.println("Общее количество элементов во вложенных списках: " + totalElements);
    }

    // 1. Метод объединения и сортировки двух списков чисел
    public static List<Integer> mergeAndSortLists(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2); // Объединение списков
        Collections.sort(mergedList); // Сортировка списка
        return mergedList;
    }

    // 2. Метод поиска общих элементов строк
    public static List<String> findCommonElements(List<String> list1, List<String> list2) {
        ArrayList<String> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2); // Оставляем только общие элементы
        return commonElements;
    }

    // 3. Метод подсчёта общего количества элементов во вложенных списках
    public static int countTotalElements(List<List<Integer>> listOfLists) {
        int totalCount = 0;
        for (List<Integer> sublist : listOfLists) {
            totalCount += sublist.size(); // Суммируем размер каждого вложенного списка
        }
        return totalCount;
    }
}
