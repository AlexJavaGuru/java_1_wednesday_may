package lv.javaguru.student_eugene_sheinin.homework.lesson_5.level_5_6;

public class ArrayUtilTest {
    ArrayUtil arrayUtil = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int expectedResult = 5;
        int actualResult = (this.arrayUtil.createArray(5)).length;
        check(expectedResult, actualResult, "shouldCreateArray test");
    }

    public void shouldFindMaxNumber() {
        int[] array = {4 , 8, 2, 6};
        int expectedResult = 8;
        int actualResult = this.arrayUtil.findMaxNumber(array);
        check(expectedResult, actualResult, "shouldFindMaxNumber test");
    }

    public void shouldFindMinNumber() {
        int[] array = {4 , 8, 3, 6};
        int expectedResult = 3;
        int actualResult = this.arrayUtil.findMinNumber(array);
        check(expectedResult, actualResult, "shouldFindMinNumber test");
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
