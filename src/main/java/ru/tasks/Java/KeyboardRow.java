package ru.tasks.Java;

import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

    public static void main(String[] args) {

        String[] words1 = {"Hello","Alaska","Dad","Peace"};
        String[] words2 = {"omk"};
        String[] words3 = {"adsdf","sfd"};

        System.out.println(Arrays.toString(findWords(words1)));
        System.out.println(Arrays.toString(findWords(words2)));
        System.out.println(Arrays.toString(findWords(words3)));
    }

    public static String[] findWords(String[] words) {

        List<String> wordsList = Arrays.stream(words).toList();

        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        List<Character> charsRow1 = row1.chars()
                .mapToObj(ch -> (char) ch)
                .toList();

        List<Character> charsRow2 = row2.chars()
                .mapToObj(ch -> (char) ch)
                .toList();

        List<Character> charsRow3 = row3.chars()
                .mapToObj(ch -> (char) ch)
                .toList();

        List<String> resultList = wordsList.stream()
                .filter(w -> (
                        charsRow1.containsAll(
                                w.chars()
                                .mapToObj(ch -> (char) ch)
                                .toList())
                                ||
                        charsRow2.containsAll(
                                w.chars()
                                .mapToObj(ch -> (char) ch)
                                .toList())
                                ||
                        charsRow3.containsAll(
                                w.chars()
                                .mapToObj(ch -> (char) ch)
                                .toList())))
                .toList();

        return resultList.toArray(new String[0]);
        }
}
