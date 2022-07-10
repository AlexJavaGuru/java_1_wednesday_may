package main.java.lv.javaguru.student_rodions_pismennijs.lesson_5.level_5_6;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    ArrayUtil arrayUtil = new ArrayUtil();

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    public void shouldCreateArray() {
        int[] result = arrayUtil.createArray(8);
        check(result.length == 8, "Array create");
    }

    public void shouldFindMaxNumber() {
        int[] testArray = {5, 50, 42, 84, 66};
        int expectMax = 84;
        int resultMax = arrayUtil.findMaxNumber(testArray);
        check(expectMax == resultMax, "Max test");
    }

    public void shouldFindMinNumber() {
        int[] testArray = {80, 23, 9, 55, 20};
        int expectMin = 9;
        int resultMin = arrayUtil.findMinNumber(testArray);
        check(expectMin == resultMin, "Min test");
    }
}
