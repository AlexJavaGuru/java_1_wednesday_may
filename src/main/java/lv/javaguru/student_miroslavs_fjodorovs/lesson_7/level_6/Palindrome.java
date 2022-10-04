package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_6;

class Palindrome {

    boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", " ").toLowerCase();
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - i - 1]) {
                return true;
            }
        }
        return false;
    }
}
