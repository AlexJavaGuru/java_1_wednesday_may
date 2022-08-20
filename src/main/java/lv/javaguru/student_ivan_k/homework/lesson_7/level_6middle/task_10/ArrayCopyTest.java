package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        testIsCopyInRange();


    }


    static void testIsCopyInRange() {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedResult = {5, 6, 7, 8, 9, 10};
        int[] actualResult = arrayCopy.copyInRange(testArray, 5, 10);
        check(Arrays.equals(expectedResult, actualResult), "Is copy range");
    }

    static void check(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " test has passed.OK!");
        } else {
            System.out.println(testName + " test has been failed!!!!!!!!");
        }
    }


}
