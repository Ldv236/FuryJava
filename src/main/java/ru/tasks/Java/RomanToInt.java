package ru.tasks.Java;

import java.util.ArrayList;

public class RomanToInt {

    public int romanToInt(String s) {  //принимает число римскими цифрами (латиница), переводит в число арабскими цифрами
        int digit;
        int length = s.length();
        int sum = 0;
        String subStr;
        ArrayList<Integer> digitList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (length - i == 1) subStr = s.substring(i, i + 1);
            else subStr = s.substring(i, i + 2);

            digit = switch (subStr) {
                case "IV"  -> 4;
                case "IX" -> 9;
                case "XL" -> 40;
                case "XC" -> 90;
                case "CD" -> 400;
                case "CM" -> 900;
                default -> 0;
            };
            if (digit != 0) {
                i++;
            } else {
                digit = switch (subStr.substring(0, 1)) {
                    case "I" -> 1;
                    case "V" -> 5;
                    case "X" -> 10;
                    case "L" -> 50;
                    case "C" -> 100;
                    case "D" -> 500;
                    case "M" -> 1000;
                    default -> 0;
                };
            } //if there is digit value still is null, return the exception obviously
            digitList.add(digit);
        }
        for (Integer integer : digitList) {
            sum += integer;
        }
        return sum;
    }
}
