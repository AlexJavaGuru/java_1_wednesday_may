package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

import java.util.Arrays;

class Palindrome {


    boolean isPalindrome(String text) {
        String longText = replace(text);
        char[] chars = arraySimbl(longText);


        return isArrayPalindrome(chars);
    }


    public String replace(String text) {
        String longText = text.replaceAll("[^\\w]", "");

        return longText;
    }

    public char[] arraySimbl(String longText) {
        char[] chars = new char[longText.length()];

        for (int i = 0; i < longText.length(); i++) {
            chars[i] = longText.charAt(i);
        }

        System.out.print(Arrays.toString(chars));

        return chars;
    }

    public boolean isArrayPalindrome(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}