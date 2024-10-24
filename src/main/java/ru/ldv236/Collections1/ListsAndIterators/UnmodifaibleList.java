package ru.ldv236.Collections1.ListsAndIterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifaibleList {
    public static void main(String[] args) {
        List<String> unmodifaibleList;
//        unmodifaibleList = List.of("a", "b", "c");
//        unmodifaibleList.add("d");

        unmodifaibleList = new ArrayList<>();
        unmodifaibleList.add("A");
        unmodifaibleList.add("B");
        unmodifaibleList.add("C");
        unmodifaibleList = Collections.unmodifiableList(unmodifaibleList);
        unmodifaibleList.add("d");
    }
}
