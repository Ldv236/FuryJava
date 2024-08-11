package ru.ldv236.top;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Массив 1 6,8,6,7,3 Массив 2 2,5,8,7,3 Результат: 6,2,5
//        int[] array1 = {6,8,6,7,3};
//        int[] array2 = {2,5,8,7,3};
//
//        System.out.println(Arrays.toString(findUniqueElements(array1, array2)));

//        Lion myLion = new Lion("myLion");
//        Elefant myElefant = new Elefant("myElefant");
//
//        myLion.eat();
//        myLion.makeSound();
//        myLion.sleep();
//
//        myElefant.eat();
//        myElefant.makeSound();
//        myElefant.sleep();

//        System.out.println(reverseString("I love Java 111!"));

        //А роза упала на лапу Азора.
//        System.out.println(checkPalindrome("А роза упала на лапу Азора"));
        System.out.println(checkPalindrome("A bcde fEd cba"));
        System.out.println(checkPalindrome("A bcde fREd cba"));
    }

    static boolean checkPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = cleanString.length() - 1;

        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static String reverseString(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    static int[] findUniqueElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            set1.add(array1[i]);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < array2.length; i++) {
            set2.add(array2[i]);
        }

        Set<Integer> uniqueSet1 = new HashSet<>(set1);
        Set<Integer> uniqueSet2 = new HashSet<>(set2);

        uniqueSet1.removeAll(set2);
        uniqueSet2.removeAll(set1);

        uniqueSet1.addAll(uniqueSet2);

        int[] result = new int[uniqueSet1.size()];
        int index = 0;
        for (Integer i : uniqueSet1) {
            result[index++] = i;
        }

        return result;
    }
}
