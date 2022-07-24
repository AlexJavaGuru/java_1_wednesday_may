package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containTest();
        test.notContainTest();
        test.countOccurrencesNotZeroTest();
        test.countOccurrencesZeroTest();
        test.replaceFirstWithOccurrenceTest();
        test.replaceFirstWithNoOccurrenceTest();
        test.replaceFirstWithOccurrenceCompareArraysTest();
        test.replaceAllWithOccurrencesTest();
        test.replaceAllWithoutOccurrencesTest();
        test.replaceAllCompareArraysTest();
        test.revertTest();
        test.sortTest();
    }

    void containTest() {
        int [] array = {3 ,5 ,6 ,7 ,2 };
        checkTestResult(
                arrayService.contains(array, 6),
                "contain number Test"
        );
    }

    void notContainTest() {
        int [] array = {3 ,5 ,6 ,7 ,2 };
        checkTestResult(
                !arrayService.contains(array, 9),
                "not contain number Test"
        );
    }

    void countOccurrencesNotZeroTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        checkTestResult(
                arrayService.countOccurrences(array, 6) == 2,
                "Count Occurrences Not Zero Test"
        );
    }

    void countOccurrencesZeroTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        checkTestResult(
                arrayService.countOccurrences(array, 1) == 0,
                "Count Occurrences Zero Test"
        );
    }

    void replaceFirstWithOccurrenceTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        checkTestResult(
                arrayService.replaceFirst(array, 6, 1),
                "replace First With Occurrence Test"
        );

    }

    void replaceFirstWithNoOccurrenceTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        checkTestResult(
                !arrayService.replaceFirst(array, 9, 1),
                "replace First With No Occurrence Test"
        );

    }

    void replaceFirstWithOccurrenceCompareArraysTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        int [] expectedArray = {3 ,5 , 1 ,7 ,2 , 6};
        arrayService.replaceFirst(array, 6, 1);
        checkTestResult(
                Arrays.equals(array, expectedArray),
                "replace First With Occurrence Compare Arrays Test"
        );

    }


    void replaceAllWithOccurrencesTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        int expectedReplacedNumbers = 2;
        checkTestResult(
                arrayService.replaceAll(array, 6, 1) == expectedReplacedNumbers,
                "replace All With Occurrences Test"
        );
    }

    void replaceAllWithoutOccurrencesTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        int expectedReplacedNumbers = 0;
        checkTestResult(
                arrayService.replaceAll(array, 9, 1) == expectedReplacedNumbers,
                "replace All Without Occurrences Test"
        );
    }

    void replaceAllCompareArraysTest() {
        int [] array = {3 ,5 , 6 ,7 ,2 , 6};
        int [] expectedArray = {3 ,5 , 1 ,7 ,2 , 1};
        arrayService.replaceAll(array, 6, 1);
        checkTestResult(
                Arrays.equals(array, expectedArray),
                "replace All Compare Arrays Test"
        );
    }

    void revertTest() {
        int[] array = { 2, 6, 7, 8, 9 , 4, 5};
        int [] expectedArray = { 5, 4, 9, 8, 7, 6, 2 };
        arrayService.revert(array);
        checkTestResult(
                Arrays.equals(array, expectedArray),
                "revert Arrays Test"
        );
    }

    void sortTest() {
        int[] array = { 2, 6, 7, 8, 9 , 4, 5};
        int [] expectedArray = { 2, 4, 5, 6, 7, 8, 9 };
        arrayService.sort(array);
        checkTestResult(
                Arrays.equals(array, expectedArray),
                "sort Arrays Test"
        );
    }


    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
