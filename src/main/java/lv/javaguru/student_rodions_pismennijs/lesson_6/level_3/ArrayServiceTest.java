package main.java.lv.javaguru.student_rodions_pismennijs.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.findNumberIn();
        test.findNumberOut();
        test.counter();
        test.counterZero();
        test.replaceFirst();
        test.replaceFirstFalse();
        test.replaceAll();
        test.replaceAllFalse();
        test.revert();
        test.sort();
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    ArrayService arrayService = new ArrayService();

    public void findNumberIn() {
        int[] array = {1, 2, 3, 4, 5};
        check(arrayService.findNumber(array, 3), "Number in array");
    }

    public void findNumberOut() {
        int[] array = {1, 2, 3, 4, 5};
        check(!arrayService.findNumber(array, 6), "Number out array");
    }

    public void counter() {
        int[] array = {1, 2, 1, 4, 3};
        check(arrayService.countNumbers(array, 1) == 2, "Counter");
    }

    public void counterZero() {
        int[] array = {1, 2, 1, 4, 3};
        check(arrayService.countNumbers(array, 5) == 0, "Counter zero");
    }

    public void replaceFirst() {
        int[] array = {1, 2, 3, 1, 4};
        check(arrayService.replaceFirst(array, 1, 6), "Replace first");
    }

    public void replaceFirstFalse() {
        int[] array = {1, 2, 3, 1, 4};
        check(!arrayService.replaceFirst(array, 5, 2), "Replace first false");
    }

    public void replaceAll() {
        int[] array = {1, 2, 3, 1, 4, 1, 5, 1, 6, 1};
        check(arrayService.replaceAll(array, 1, 8) == 5, "Replace all");
    }

    public void replaceAllFalse() {
        int[] array = {1, 2, 3, 1, 4, 1, 5, 1, 6, 1};
        check(arrayService.replaceAll(array, 7, 5) == 0, "Replace all false");
    }

    public void revert() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expArray = {5, 4, 3, 2, 1};
        arrayService.revert(array);
        check(Arrays.equals(array, expArray), "Revert");
    }

    public void sort() {
        int[] array = {9, 5, 4, 8, 6, 2, 3, 1, 4, 1};
        int[] expArray = {1, 1, 2, 3, 4, 4, 5, 6, 8, 9};
        arrayService.sort(array);
        check(Arrays.equals(array, expArray), "Sort");
    }
}
