package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_5_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.createArray(5);
        if (result.length == 5) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {6, 7, 8, 9};
        int expectResult = 9;
        int actualResult = arrayUtil.findMaxNumber(numbers);
        if (expectResult == actualResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {1, 45, 67, 8};
        int expectResult = 1;
        int actualResult = arrayUtil.findMinNumber(numbers);
        if (expectResult == actualResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }
}
