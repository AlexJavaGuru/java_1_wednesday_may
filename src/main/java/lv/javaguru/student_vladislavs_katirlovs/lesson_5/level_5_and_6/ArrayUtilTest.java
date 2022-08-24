package lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_5_and_6;

import java.util.Arrays;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int arrayLength = 4;
        int expectedResult = 4;
        ArrayUtil create = new ArrayUtil();
        int[] array = create.createArray(arrayLength);
        int actualResult = array.length;
        System.out.println("Array elements: " + Arrays.toString(array));
        if (actualResult == expectedResult) {
            System.out.println("Array util test - OK");
        } else {
            System.out.println("Array util test - FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        int arrayLength = 5;
        int expectedResult = 99;
        ArrayUtil create = new ArrayUtil();
        int[] array = create.createArray(arrayLength);
        array[0] = 85;
        array[1] = 33;
        array[2] = 1;
        array[3] = 99;
        array[4] = 45;
        int actualResult = create.findMaxNumber(array);
        System.out.println("Array elements: " + Arrays.toString(array));
        if (actualResult == expectedResult) {
            System.out.println("Find max number test - OK");
        } else {
            System.out.println("Find max number test - FAIL");
        }
    }

    public void shouldFindMinNumber() {
        int arrayLength = 5;
        int expectedResult = 21;
        ArrayUtil create = new ArrayUtil();
        int[] array = create.createArray(arrayLength);
        array[0] = 56;
        array[1] = 23;
        array[2] = 67;
        array[3] = 99;
        array[4] = 21;
        int actualResult = create.findMinNumber(array);
        System.out.println("Array elements: " + Arrays.toString(array));
        if (actualResult == expectedResult) {
            System.out.println("Find min number test - OK");
        } else {
            System.out.println("Find min number test - FAIL");
        }
    }
}