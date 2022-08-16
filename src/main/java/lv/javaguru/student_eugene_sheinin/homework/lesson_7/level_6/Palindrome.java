package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_6;

import java.util.Arrays;

public class Palindrome {
    boolean isPalindrome(String text){
        char[] chars = cleanAndReformatChars(text.toCharArray());
        for(int i = 0; i < chars.length/2; i++){
            if (chars[i] != chars[(chars.length - 1) - i]){
                return false;
            }

        }

        return true;
    }

    char[] cleanAndReformatChars(char[] chars) {
        char[] newChars = new char[getNotEmptyCount(chars)];
        int newCharsIndex = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != ' ') {
                newChars[newCharsIndex++] = Character.toLowerCase(chars[i]);
            }
        }

        return newChars;
    }

    private int getNotEmptyCount(char[] chars) {
        int notEmptyCount = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != ' ') {
                notEmptyCount++;
            }
        }
        return notEmptyCount;
    }
}
