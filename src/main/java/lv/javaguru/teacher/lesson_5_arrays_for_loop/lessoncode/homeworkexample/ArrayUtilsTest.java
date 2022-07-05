package main.java.lv.javaguru.teacher.lesson_5_arrays_for_loop.lessoncode.homeworkexample;

public class ArrayUtilsTest {


    public static void main(String[] args) {
        ArrayUtilsTest test = new ArrayUtilsTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] result = arrayUtils.createArray(10);
        check(result.length == 10, "Array creation");
    }

    public void shouldFindMaxNumber() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] testArray = {1, 6, 20, 15, 33, 75, 14};
        int expectedResult = 75;
        int actualResult = arrayUtils.findMaxNumber(testArray);
        check(expectedResult == actualResult, "Find Max");
    }

    private void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println(testName + " Test Passed");
        } else {
            System.out.println(testName + " Test Failed");
        }
    }

}
