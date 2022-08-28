package lv.javaguru.student_rodions_pismennijs.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopyTest {

    public static void main(String[] args) {
        copyInRangeTest1();
        copyInRangeTest2();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static ArrayCopy arrayCopy = new ArrayCopy();

    static void copyInRangeTest1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = arrayCopy.copyInRange(array, 2, 8);
        int[] expResult = {2, 3, 4, 5, 6, 7, 8};
        check(Arrays.equals(result, expResult), "Copy In Range Test 1");
    }

    static void copyInRangeTest2() {
        int[] array = {39, 24, 68, 45, 97, 12, 80, 56, 73, 41};
        int[] result = arrayCopy.copyInRange(array, 20, 50);
        int[] expResult = {39, 24, 45, 41};
        check(Arrays.equals(result, expResult), "Copy In Range Test 2");
    }
}
