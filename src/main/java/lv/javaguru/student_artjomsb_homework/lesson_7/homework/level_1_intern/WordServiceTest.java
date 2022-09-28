package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_1_intern;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        testStringTransformToArray();
        testFindMostFrequentWord();
    }

    static void testStringTransformToArray() {
        WordService tester = new WordService();
        String testString = "abc cba bca bba abb cba ccb";
        String[] expectedResult = {"abc", "cba", "bca", "bba", "abb", "cba", "ccb"};
        String[] resultArray = tester.stringToArray(testString);
        check(Arrays.equals(expectedResult, resultArray), "Test that string words put in to array");
    }

    static void testFindMostFrequentWord() {
        WordService tester = new WordService();
        String testString = "abc cba bca bba abb cba ccb";
        String expectedResult = "cba";
        check(tester.textToArrayThenSortAndFindMostFrequent(testString).equals(expectedResult), "Test find most frequent word in text");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
