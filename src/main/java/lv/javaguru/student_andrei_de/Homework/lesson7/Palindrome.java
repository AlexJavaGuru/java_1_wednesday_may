package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;

class Palindrome {

    boolean isPalindrome(String text) {
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - i - 1]) {
                return true;
            }
        }
        return false;
    }
}