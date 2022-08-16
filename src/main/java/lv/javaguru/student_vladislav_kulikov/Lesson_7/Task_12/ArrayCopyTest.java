package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_7.Task_12;

class ArrayCopyTest {

    public static void main(String[] args) {
        copyInRangeTest();
        copyInRangeTestTwo();
    }


    static void copyInRangeTest() {
        ArrayCopy subject = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedResult = {2, 3, 4};
        int[] actualResult = subject.copyInRange(array, 2, 4);
        check(actualResult, expectedResult, "Number range");
    }

    static void copyInRangeTestTwo() {
        ArrayCopy subject = new ArrayCopy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actualResult = subject.copyInRange(array, 1, 10);
        check(actualResult, expectedResult, "All numbers");
    }

    static void check(int[] array, int[] arrayCopy, String taskName) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == arrayCopy[i]) {
                result = taskName + " = OK";
            } else {
                result = taskName + " = Failed";
            }
        }
        System.out.println(result);
    }
}


