package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_11;


class Palindrome {

    boolean isPalindrome(String text) {
        int length = text.length();
        char[] palindrome = new char[length];
        for (int i = 0; i < length; i++) {
            palindrome[length - i - 1] = text.charAt(i);
        }
        String string = String.valueOf(palindrome);
        return string.equalsIgnoreCase(text);
    }

  }


