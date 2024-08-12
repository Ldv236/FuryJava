package ru.LeetCode.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShortestCompletingWord {

    public static void main(String[] args) {

        String licensePlate1 = "1s3 PSt";
        String[] words1 = {"step", "steps", "stripe", "stepple"};
        String licensePlate2 = "1s3 456";
        String[] words2 = {"looks", "pest", "stew", "show"};

        System.out.println(shortestCompletingWord(licensePlate1, words1));
        System.out.println(shortestCompletingWord(licensePlate2, words2));
        System.out.println(shortestCompletingWord2(licensePlate1, words1));
        System.out.println(shortestCompletingWord2(licensePlate2, words2));
    }


    public static String shortestCompletingWord(String licensePlate, String[] words) {

        List<Character> licenseChars = new ArrayList<>();
        List<Character> wordChars = new ArrayList<>();
        String result = null;
/*
        Character currentChar = null;
        for (int i = 0; i < licensePlate.length(); i++) {
            currentChar = licensePlate.charAt(i);
            if(Character.isLetter(currentChar)) {
                licenseChars.add(currentChar);
            }
        }*/

        licenseChars = licensePlate.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .filter(Character::isLetter)
                .toList();

        for (int i = 0; i < words.length; i++) {
            wordChars = words[i].chars()
                    .mapToObj(c -> Character.toLowerCase((char) c))
                    .filter(Character::isLetter)
                    .toList();
            if (wordChars.containsAll(licenseChars)) {
                if (result == null || words[i].length() < result.length()) {
                    result = words[i];
                }
            }
        }

        return result;
    }

    public static String shortestCompletingWord2(String licensePlate, String[] words) {

        List<Character> licenseChars = new ArrayList<>();
        List<Character> wordChars = new ArrayList<>();
        String result = null;
        Boolean containsAllChar = false;

        licenseChars = licensePlate.chars()
                .mapToObj(c -> Character.toLowerCase((char) c))
                .filter(Character::isLetter)
                .toList();

        mark:
        for (int i = 0; i < words.length; i++) {
            wordChars = words[i].chars()
                    .mapToObj(c -> Character.toLowerCase((char) c))
                    .filter(Character::isLetter)
                    .toList();

            containsAllChar = true;
            for (int i1 = 0; i1 < licenseChars.size(); i1++) {
                if (!wordChars.contains(licenseChars.get(i1))) {
                    containsAllChar = false;
                    continue mark;
                }
                wordChars.remove(licenseChars.get(i1));
            }

            if (containsAllChar) {
                if (result == null || words[i].length() < result.length()) {
                    result = words[i];
                }
            }
        }

        return result;
    }
}
