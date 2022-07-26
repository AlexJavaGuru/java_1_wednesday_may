package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_31_32_33_34_35_36_37_38;

class ArrayUtilTest {

    final ArrayUtil subject = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    void shouldCreateArray() {
        int[] result = subject.createArray(10);
        check(result.length == 10, "Create Array Test");
    }

    void shouldFindMaxNumber() {
        int[] array = {1, 2, 10, 0, 11};
        int result = subject.findMaxNumber(array);
        check(result == 11, "Max Number Test");
    }

    void shouldFindMinNumber() {
        int[] array = {10, 100, 50, 1};
        int result = subject.findMinNumber(array);
        check(result == 1, "Min number Test");
    }

    void check(boolean isPassed, String taskName) {
        if (isPassed) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
