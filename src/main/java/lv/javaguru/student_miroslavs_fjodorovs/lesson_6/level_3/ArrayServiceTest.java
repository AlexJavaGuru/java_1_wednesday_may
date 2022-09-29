package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsTestTrue();
        arrayServiceTest.containsTestFalse();
        arrayServiceTest.countOccurrencesTestTrue();
        arrayServiceTest.countOccurrencesTestFalse();
        arrayServiceTest.replaceFirstTestTrue();
        arrayServiceTest.replaceFirstTestFalse();
        arrayServiceTest.replaceAllTestTrue();
        arrayServiceTest.replaceAllTestFalse();
        arrayServiceTest.revertTest();
        arrayServiceTest.sortTest();
    }

    ArrayService arrayService = new ArrayService();

    public void containsTestTrue() {
        int[] arr = {7, 1, 3, 6, 8};
        checkTestResult(arrayService.contains(arr, 8), "Contains true test");
    }

    public void containsTestFalse() {
        int[] arr = {7, 1, 3, 6, 8};
        checkTestResult(!arrayService.contains(arr, 9), "Contains false test");
    }

    public void countOccurrencesTestTrue() {
        int[] arr = {7, 8, 3, 6, 8};
        checkTestResult(arrayService.countOccurrences(arr, 8) == 2, "Count occurrences true test");
    }

    public void countOccurrencesTestFalse() {
        int[] arr = {7, 1, 3, 6, 8};
        checkTestResult(arrayService.countOccurrences(arr, 2) == 0, "Count occurrences false test");
    }

    public void replaceFirstTestTrue() {
        int[] arr = {7, 8, 3, 6, 8};
        checkTestResult(arrayService.replaceFirst(arr, 8, 1), "Replace first true test");
    }

    public void replaceFirstTestFalse() {
        int[] arr = {7, 1, 3, 6, 8};
        checkTestResult(!arrayService.replaceFirst(arr, 2,4), "Replace first false test");
    }

    public void replaceAllTestTrue() {
        int[] arr = {7, 8, 3, 6, 8};
        checkTestResult(arrayService.replaceAll(arr,8, 1) == 2, "Replace all true test");
    }

    public void replaceAllTestFalse() {
        int[] arr = {7, 1, 3, 6, 8};
        checkTestResult(arrayService.replaceAll(arr, 2, 1) == 0, "Replace all false test");
    }

    public void revertTest() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expectedArr = {5, 4, 3, 2, 1};
        arrayService.revert(arr);
        checkTestResult(Arrays.equals(arr, expectedArr), "Revert test");
    }

    public void sortTest() {
        int[] arr = {3, 1, 5, 4, 2};
        int[] expectedArr = {1, 2, 3, 4, 5};
        arrayService.sort(arr);
        checkTestResult(Arrays.equals(arr, expectedArr), "Sort test");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
