package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;


import java.util.Arrays;

class ArrayCopyTest {


    public static void main(String[] args) {
        copyInRangeTest1();
        copyInRangeTest2();
    }

    static void check(boolean condition , String testName) {
        if (condition) {
            System.out.println(testName + " - Ok");
        } else {
            System.out.println(testName + " - Fail");
        }
    }

    static ArrayCopy arrayCopy = new ArrayCopy();

    static void copyInRangeTest1() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] result = arrayCopy.copyInRange(array, 1,7);
        int[] expectedResult = {1,2,3,4,5,6,7};
        check(Arrays.equals(result, expectedResult), "Copy In Range Test1");
    }

    static void copyInRangeTest2() {
        int[] array = {82, 39, 19, 42, 66, 25, 99, 58, 29, 45};
        int[] result = arrayCopy.copyInRange(array, 23, 46);
        int[] expectedResult = {39, 42, 25, 29, 45};
        check(Arrays.equals(result, expectedResult), "Copy In Range Test2");
    }
}
