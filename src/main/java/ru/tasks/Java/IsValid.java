package ru.tasks.Java;

import java.util.ArrayList;

public class IsValid {
    static void method() {

    }
    //sol.isValid("(){[]");

    public boolean isValid(String s) {
        int length = s.length();
        char charBreak;
        boolean result = true;

        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            charList.add(s.charAt(i));
        }

        for (int i = 0; i < charList.size() - 1; i = i) {
            charBreak = switch (charList.get(i)) {
                case '(' -> ')';
                case '{' -> '}';
                case '[' -> ']';
                default -> '0';
            };

            if (charList.get(i + 1) == charBreak) {
                charList.remove(i + 1);
                charList.remove(i);
                i = 0;
            }
            else i++;
        }
        return charList.size() == 0;
    }
}
