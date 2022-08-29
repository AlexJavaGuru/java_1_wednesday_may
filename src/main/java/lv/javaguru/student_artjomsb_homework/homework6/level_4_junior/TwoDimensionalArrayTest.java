package lv.javaguru.student_artjomsb_homework.homework6.level_4_junior;

import java.util.Arrays;

class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest runner = new TwoDimensionalArrayTest();
        runner.testCreatingArray();
        runner.testFindingSumInArray();
    }

    void testCreatingArray() {
        TwoDimensionalArray tester = new TwoDimensionalArray();
        int[][] result = tester.createArray(3, 7);
        int[][] expectedResult = new int[3][7];
        check(Arrays.deepEquals(result, expectedResult), "Test array creating");

    }

    void testFindingSumInArray() {
        TwoDimensionalArray tester = new TwoDimensionalArray();
        int[][] testArray = {{5, 2, 7},
                            {4, 9, -1},
                            {-3, 2, 8}};
        int expectedResult = 33;
        check(expectedResult == tester.sumInArray(testArray),"Test sum in array");
    }

    private static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test, " + testName + ", Passed");
        } else {
            System.out.println("Test, " + testName + ", Failed");
        }
    }
}
