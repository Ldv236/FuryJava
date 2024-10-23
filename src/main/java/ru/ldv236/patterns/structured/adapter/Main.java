package ru.ldv236.patterns.structured.adapter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] arguments) {

        String[] array = {"One", "Two", "Three"};
        List<String> strings = Arrays.asList(array);
//        strings.add("fff");
        strings.set(0, "1");
        System.out.println(Arrays.toString(array));

        PlugAdapter plugAdapter = new PlugAdapter(new BritishPlug());
        plugAdapter.useEuropeanPlug();
    }
}
