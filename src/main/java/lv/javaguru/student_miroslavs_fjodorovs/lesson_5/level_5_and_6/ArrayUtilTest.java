package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_5.level_5_and_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    ArrayUtil arrayUtil = new ArrayUtil();

    public void shouldCreateArray() {
        int[] result = ArrayUtil.createArray(10);
        check(result.length == 10, "Create Array Test");
    }

    public void shouldFindMaxNumber() {
        int[] testArray = {6, 9, 15, 7, 21};
        int expectedResultMax = 21;
        int realResultMax = arrayUtil.findMaxNumber(testArray);
        check(expectedResultMax == realResultMax, "Max Number Test");
    }

    public void shouldFindMinNumber() {
        int[] testArray = {17, 3, 42, 44, 8};
        int expectedResultMin = 3;
        int realResultMin = arrayUtil.findMinNumber(testArray);
        check(expectedResultMin == realResultMin, "Min Number Test");
    }

    public void check (boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println(testName + " has been passed");
        } else {
            System.out.println(testName + " has been failed");
        }
    }
}
