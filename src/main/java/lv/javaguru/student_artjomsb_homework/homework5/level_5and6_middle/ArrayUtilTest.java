package main.java.lv.javaguru.student_artjomsb_homework.homework5.level_5and6_middle;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindEvenNumber();
        test.shouldFindOddNumber();
    }

    void shouldCreateArray() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = victim.createArray(5);
        check(testArray.length == 5, "Test array length");
    }

    void shouldFillWithRandomNumbers() {
        ArrayUtil victim = new ArrayUtil();
        boolean isPassed = true;
        int[] testArrayOne = new int[5];
        victim.fillArrayWithRandomNumbers(testArrayOne);
        for (int i = 0; i < testArrayOne.length; i++) {
            testArrayOne[i] *= -1;
        }
        int[] testArrayTwo = Arrays.copyOf(testArrayOne, testArrayOne.length);
        victim.fillArrayWithRandomNumbers(testArrayOne);
        for (int i = 0; i < testArrayOne.length; i++) {
            if (testArrayOne[i] == testArrayTwo[i]) {
                isPassed = false;
                break;
            }
        }
        check(isPassed, "Test random numbers filling");
    }

    void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 10, 30, -10, 5};
        int expectedResult = 30;
        check(expectedResult == victim.findMaxNumber(testArray), "Test find largest number");
    }

    void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 10, 30, -10, 5};
        int expectedResult = -10;
        check(expectedResult == victim.findMinNumber(testArray), "Test find smallest number");
    }

    void shouldFindEvenNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 10, 30, -10, 5};
        int[] expectedResult = {10, 30, -10};
        check(Arrays.toString(expectedResult).equals(Arrays.toString(victim.findEvenNumbers(testArray))), "Test find even numbers");
    }

    void shouldFindOddNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] testArray = {1, 10, 30, -10, 5};
        int[] expectedResult = {1, 5};
        check(Arrays.toString(expectedResult).equals(Arrays.toString(victim.findOddNumbers(testArray))), "Test find odd numbers");
    }

    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + ", is Passed");
        else System.out.println("Test - " + testName + ", is Failed");
    }
}
