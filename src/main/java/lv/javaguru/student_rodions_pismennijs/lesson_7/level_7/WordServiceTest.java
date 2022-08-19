package main.java.lv.javaguru.student_rodions_pismennijs.lesson_7.level_7;

import java.util.Arrays;
import java.util.Objects;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.findMostFrequentWord();
        test.countArray();
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    WordService wordService = new WordService();

    void findMostFrequentWord() {
        String text = "hello how are you today how is the weather how is how";
        String result = wordService.findMostFrequentWord(text);
        String expResult = "how";
        check(Objects.equals(result, expResult), "Find Most Frequent Word Test");
    }

    void countArray() {
        String[] array = {"hello", "how", "are", "you", "today", "how", "is", "the", "weather", "how", "is", "how"};
        int[] result = wordService.countArray(array);
        int[] expResult = {1, 4, 1, 1, 1, 4, 2, 1, 1, 4, 2, 4};
        check(Arrays.equals(result, expResult), "Count Array test");
    }
}
