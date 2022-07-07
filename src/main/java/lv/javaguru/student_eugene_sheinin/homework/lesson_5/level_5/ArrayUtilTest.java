package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_5.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int expectedResult = 5;
        int actualResult = (arrayUtil.createArray(5)).length;
        check(expectedResult, actualResult, "shouldCreateArray test");
    }
    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
