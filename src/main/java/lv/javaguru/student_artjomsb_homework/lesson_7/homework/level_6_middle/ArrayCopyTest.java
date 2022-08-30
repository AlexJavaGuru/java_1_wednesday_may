package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_6_middle;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        testArrayCopy();
    }
    static void testArrayCopy(){
        ArrayCopy tester = new ArrayCopy();
        int[] array = {53,21,33,12,3,7,8,-33,11,34};
        int[] result = tester.copyInRange(array,12,33);
        int[] expectedResult = {21, 33, 12};
        check(Arrays.equals(result,expectedResult),"Check correct copying");
    }
    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
