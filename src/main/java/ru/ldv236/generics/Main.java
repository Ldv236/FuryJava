package ru.ldv236.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<List<String>> listOfLists = new ArrayList<>();
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfLists.add(listOfStrings);
    }
}