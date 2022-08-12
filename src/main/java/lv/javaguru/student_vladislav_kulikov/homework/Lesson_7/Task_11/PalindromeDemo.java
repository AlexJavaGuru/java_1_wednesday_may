package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_11;

import java.util.Arrays;

class PalindromeDemo {
/*
    String isPalindrome(String text) {
        String[] word = fromStringToArrayString(text);
        int[] count = new int[word.length];
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if(word[i].equals(word[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i] > maxCount) {
                maxCount = count[i];
                index = i;
            }
        }
        return word[index];
    }

 */

    String[] fromStringToArrayString(String text) {
        String[] word = text.split(" ");
        return word;
    }

    // for (int i = 0; i < array.length / 2; i++) {
//                int tmp = array[i];
//                array[i] = array[array.length - i - 1];
//                array[array.length - i - 1] = tmp;
//            }
    /*
    void isPalindrome(String text) {
        String[] word = fromStringToArrayString(text);
        for (int i = 0; i < word.length / 2; i++) {
            String tmp = word[i];
            word[i] = word[word.length - i - 1];
            word[word.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(word));
    }

     */
            boolean reverse(String str) {
                int n = str.length();
                char[] temp = new char[n];
                for (int i = 0; i < n; i++) {
                    temp[n - i - 1] = str.charAt(i);
                }
                return String.copyValueOf(temp).equals(str);
            }
    public static void main(String[] args) {
        PalindromeDemo subject = new PalindromeDemo();
        String str = "racecar";
        boolean result = subject.reverse(str);

        System.out.println(result);

    }
}
