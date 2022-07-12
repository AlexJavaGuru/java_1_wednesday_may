package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_5_and_6;

public class ArrayUtilTest {public static void main(String[] args) {
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
        int[] result = arrayUtil.createArray(10);
        check(result.length == 10, "Array create");
    }

    public void shouldFindMaxNumber() {
        int[] testArray = {8, 10, 12, 14, 16};
        int expectMax = 16;
        int resultMax = arrayUtil.findMaxNumber(testArray);
        check(expectMax == resultMax, "Max test");
    }

    public void shouldFindMinNumber() {
        int[] testArray = {99, 98, 97, 95, 94};
        int expectMin = 94;
        int resultMin = arrayUtil.findMinNumber(testArray);
        check(expectMin == resultMin, "Min test");
    }
}

