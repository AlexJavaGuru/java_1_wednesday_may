package lv.javaguru.student_daniels_demishins.hw_lesson_5.lvl_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.findMaxNumber();
        test.findMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.createArray(10);
        if (result.length == 10) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public void findMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {2, 15, 20, 70, 59, 39};
        int expectedResult = 70;
        int actualResult = arrayUtil.findMaxNumber(testArray);
        check(expectedResult == actualResult, "Test Max");
    }

    public void findMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {8, 16, 21, 71, 60, 43};
        int expectedResult = 8;
        int actualResult = arrayUtil.findMinNumber(testArray);
        check(expectedResult == actualResult, "Test Min");
    }

    void check(boolean isPassed, String name) {
        if (isPassed) {
            System.out.println(name + " is passed");
        } else {
            System.out.println(name + " is failed");
        }
    }
}
