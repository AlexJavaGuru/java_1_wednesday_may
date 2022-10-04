package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_7;

import java.util.Arrays;
import java.util.Objects;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWord();
        wordServiceTest.countArray();
    }

    WordService wordService = new WordService();

    void findMostFrequentWord() {
        String text = "me you we you they us me me you";
        String realResult = wordService.findMostFrequentWord(text);
        String expectedResult = "me";
        check(Objects.equals(realResult, expectedResult), "Find Most Frequent Word Test");
    }

    void countArray() {
        String[] array = {"me", "you", "we", "you", "they", "us", "me", "me", "you"};
        int[] realResult = wordService.countArray(array);
        int[] expectedResult = {3, 3, 1, 3, 1, 1, 3, 3, 3};
        check(Arrays.equals(realResult, expectedResult), "Count Array Test");
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
