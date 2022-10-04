package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {
        ArrayCopyTest arrayCopyTest = new ArrayCopyTest();
        arrayCopyTest.copyInRangeTestOne();
        arrayCopyTest.copyInRangeTestTwo();
    }

    static ArrayCopy arrayCopy = new ArrayCopy();

    static void copyInRangeTestOne() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] realResult = arrayCopy.copyInRange(array, 3, 7);
        int[] expectedResult = {3, 4, 5, 6, 7};
        check(Arrays.equals(realResult, expectedResult), "Copy In Range Test One");
    }

    static void copyInRangeTestTwo() {
        int[] array = {100, 4, 17, 71, 27, 14, 63, 54, 72, 47};
        int[] realResult = arrayCopy.copyInRange(array, 14, 71);
        int[] expectedResult = {17, 71, 27, 14, 63, 54, 47,};
        check(Arrays.equals(realResult, expectedResult), "Copy In Range Test Two");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
