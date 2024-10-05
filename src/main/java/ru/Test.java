package ru;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cornerValuesArray(new String[]{"1", "11", "111", "1111"})));
    }
    public static String[] cornerValuesArray(String[] ValuesArray) {
        int max = ValuesArray[0].length();

        String[] MinMAx = new String[2];

        for (String s : ValuesArray) {

            if (s.length() < max) {
                MinMAx[0] = s;
                max = s.length();
            } else if (s.length() == max) {
                MinMAx[1] = s;
            }
        }
        return MinMAx;
    }
}
