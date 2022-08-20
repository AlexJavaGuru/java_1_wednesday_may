package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {
        testCopyInRange();
        testCopyInRangeNotExpected();
    }

    private static void testCopyInRange() {
        ArrayCopy subject = new ArrayCopy();
        int[] inArray = {3 , 6 , 8, 2, 11, 9};
        int[] expectedArray = {6 , 8, 9};
        check(Arrays.equals(
                subject.copyInRange(inArray, 4, 10 ),
                expectedArray
        ), "test Copy InRange");
    }

    private static void testCopyInRangeNotExpected() {
        ArrayCopy subject = new ArrayCopy();
        int[] inArray = {3 , 6 , 8, 2, 11, 9};
        int[] expectedArray = {6 , 8, 9};
        check(!Arrays.equals(
                subject.copyInRange(inArray, 4, 11 ),
                expectedArray
        ), "test Copy In Range Not Expected");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
