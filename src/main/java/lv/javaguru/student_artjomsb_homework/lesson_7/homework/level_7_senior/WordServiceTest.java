package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        testFindMostFrequentWord();
        testFindPositionOfBiggestNumberInMassive();
        testCreatingMassiveThatCountWordsInAnotherMassive();
    }

    static void testFindMostFrequentWord() {
        WordService tester = new WordService();
        String result = tester.findMostFrequentWord(" hello my name is my name because this was name");
        check(result.equals("name"), "Test find most frequent word");
    }

    static void testFindPositionOfBiggestNumberInMassive() {
        WordService tester = new WordService();
        int[] array = {5, 1, 2, 1, 2, 3, 1, 5, 1, 3, 1, 5, 3, 5, 5};
        int result = tester.findPositionOfBiggestNumber(array);
        System.out.println(result);
        check(result == 5, "Test find position of biggest number");
    }

    static void testCreatingMassiveThatCountWordsInAnotherMassive() {
        WordService tester = new WordService();
        String[] array = {"a", "b", "a", "c", "c", "a", "a", "b", "a", "c"};
        int[] result = tester.createMassiveWhichReplaceWordsWithItAmount(array);
        int[] expectedResult = {5, 2, 5, 3, 3, 5, 5, 2, 5, 3};
        check(Arrays.equals(result, expectedResult), "Check that method replace word with number of it amount");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
