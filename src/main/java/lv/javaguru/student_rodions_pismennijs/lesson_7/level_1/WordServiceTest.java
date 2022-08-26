package lv.javaguru.student_rodions_pismennijs.lesson_7.level_1;

import java.util.Objects;

class WordServiceTest {

    public static void main(String[] args) {
        findMostFrequentWordTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static WordService wordService = new WordService();

    static void findMostFrequentWordTest() {
        String text = "how can I find the most frequent word in an string how can I find how how how string can can can";
        String result = wordService.findMostFrequentWord(text);
        String expResult = "how";
        check(Objects.equals(result, expResult), "Find Most Frequent Word Test");
    }
}
