package lv.javaguru.student_artjomsb_homework.homework6.level_3_junior;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        testNumberNotInArray();
        testNumberWasInArray();
        testAmountOfNumber();
        testFindZeroNumberInArray();
        testReplaceNumberInArray();
        testNotReplaceNumberInArray();
        testReplaceAllNumbersInArray();
        testNotReplaceAllNumbersInArray();
        testReversedArray();
        testReversedArrayWithEvenElements();
        testSorting();
    }

    private static void testNumberWasInArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {37, 21, -43, 9, 21, 56, 329, 1, 0};
        check(tester.isArrayContains(testArray, 9), "Test find number in Array");
    }

    private static void testNumberNotInArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {37, 21, -43, 9, 21, 56, 329, 1, 0};
        check(!tester.isArrayContains(testArray, 2), "Test find number not in Array");
    }

    private static void testAmountOfNumber() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, -1, 2, 0, -1, 3, 5, 7, 1, -1, -1, 10, 32, -1};
        check((tester.numberCounterInArray(testArray, -1) == 5), "Test amount of number in array");
    }

    private static void testFindZeroNumberInArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, -1, 2, 0, -1, 3, 5, 7, 1, -1, -1, 10, 32, -1};
        check((tester.numberCounterInArray(testArray, -10) == 0), "Test find  zero number in array");
    }

    private static void testReplaceNumberInArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, 53, 64, -1, -42};
        int[] expectedResult = {1, 53, 64, 1, -42};
        check(tester.replaceNumberInArray(testArray, -1, 1) && Arrays.equals(testArray, expectedResult), "Test replace number in array");
    }

    private static void testNotReplaceNumberInArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, 53, 64, -19, -42};
        int[] expectedResult = {1, 53, 64, -19, -42};
        check(!tester.replaceNumberInArray(testArray, -1, 10) && Arrays.equals(testArray, expectedResult), "Test not replace number in array");
    }

    private static void testReplaceAllNumbersInArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, 5, 2, 6, -1, 2, 19, 32, -2, 54, 2, 0};
        int[] expectedResult = {1, 5, 10, 6, -1, 10, 19, 32, -2, 54, 10, 0};
        check(Arrays.equals(tester.replaceNumbersInArray(testArray, 2, 10), expectedResult), "Test check that number are replaced");
    }

    private static void testNotReplaceAllNumbersInArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, 5, 2, 6, -1, 2, 19, 32, -2, 54, 2, 0};
        check(Arrays.equals(tester.replaceNumbersInArray(testArray, 10, 32), testArray), "Test check that number are not replaced");
    }

    private static void testReversedArray() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, -5, 10, 3, 27};
        int[] expectedArray = {27, 3, 10, -5, 1};
        tester.reverseArray(testArray);
        check(Arrays.equals(testArray, expectedArray), "Test check that array with odd elements reversed");
    }

    private static void testReversedArrayWithEvenElements() {
        ArrayService tester = new ArrayService();
        int[] testArray = {1, -5, 10, 3, 27, 32};
        int[] expectedArray = {32, 27, 3, 10, -5, 1};
        tester.reverseArray(testArray);
        check(Arrays.equals(testArray, expectedArray), "Test check that array with even elements reversed");
    }

    private static void testSorting() {
        ArrayService tester = new ArrayService();
        int[] testArray = {37, 15, 93, -15, 1, -1, -3, 10};
        int[] expectedArray = {-15, -3, -1, 1, 10, 15, 37, 93};
        tester.sortArray(testArray);
        check(Arrays.equals(testArray, expectedArray), "Test check that array sorted");
    }

    private static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", Passed");
        } else {
            System.out.println("Test - " + testName + ", Failed");
        }
    }
}