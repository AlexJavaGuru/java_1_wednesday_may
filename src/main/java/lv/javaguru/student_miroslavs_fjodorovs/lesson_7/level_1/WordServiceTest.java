package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_1;

import java.util.Objects;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
    }

    static WordService wordService = new WordService();

    static void findMostFrequentWordTest() {
        String text = "me you we you they us me me you";
        String realResult = wordService.findMostFrequentWord(text);
        String expectedResult = "me";
        check(Objects.equals(realResult, expectedResult), "Find Most Frequent Word Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
