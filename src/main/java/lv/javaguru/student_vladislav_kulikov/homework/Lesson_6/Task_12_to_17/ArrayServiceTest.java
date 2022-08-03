package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_6.Task_12_to_17;


class ArrayServiceTest {

    final ArrayService subject = new ArrayService();

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.NumberInArray();
        test.noNumberInArray();
        test.countCheck();
        test.countCheckTwo();
        test.replaceFirstNumber();
        test.replaceFirstNumberTwo();
        test.replaceAllNumbers();
        test.replaceAllNumbersTwo();
        test.invertedTest();
        test.selectionSortTest();

    }

    void NumberInArray() {
        int[] array = {1, 3, 1, 2};
        int numberToCheck = 1;
        boolean result = subject.findNumberInArray(array, numberToCheck);
        check(result, "Number in array");
    }

    void noNumberInArray() {
        int[] array = {2, 4, 1, 4};
        int numberToCheck = 0;
        boolean result = subject.findNumberInArray(array, numberToCheck);
        check(!result, "No number in array");
    }

    void countCheck() {
        int[] array = {1, 1, 1, 0};
        int numberToCheck = 1;
        int result = subject.countNumbersInArray(array, numberToCheck);
        check(result == 3, "Number 1 occurs 3 times");
    }

    void countCheckTwo() {
        int[] array = {1, 1, 1, 0};
        int numberToCheck = 0;
        int result = subject.countNumbersInArray(array, numberToCheck);
        check(result == 1, "Number 0 occurs 1 times");
    }

    void replaceFirstNumber() {
        int[] array = {3, 3, 3};
        int numberToReplace = 3;
        int newNumber = 2;
        boolean result = subject.changeFirstNumberInArray(array, numberToReplace, newNumber);
        check(result, "Replace first number test");
    }

    void replaceFirstNumberTwo() {
        int[] array = {1, 2, 3};
        int numberToReplace = 0;
        int newNumber = 3;
        boolean result = subject.changeFirstNumberInArray(array, numberToReplace, newNumber);
        check(!result, "Replace first number test");
    }

    void replaceAllNumbers() {
        int[] array = {1, 1, 1, 1};
        int numberToReplace = 1;
        int newNumber = 2;
        int result = subject.changeAllNumbers(array, numberToReplace, newNumber);
        check(result == 4, "Change all numbers test one");
    }

    void replaceAllNumbersTwo() {
        int[] array = {1, 1, 1, 1};
        int numberToReplace = 2;
        int newNumber = 3;
        int result = subject.changeAllNumbers(array, numberToReplace, newNumber);
        check(result == 0, "Change all numbers test two");
    }

    void invertedTest() {
        int[] array = {1, 2, 3, 4};
        int[] expectedResult = {4, 3, 2, 1};
        subject.invertedArray(array);
        arrayCheck(array, expectedResult, "Inverted array");
    }

    void selectionSortTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] expectedResult = {1, 2, 3, 4, 5};
        subject.selectionSort(array);
        arrayCheck(array, expectedResult, "Selection sort Test");
    }

    void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + "= FAILED");
        }
    }

    void arrayCheck(int[] array, int[] expectedResult, String taskName) {
        int i = 0;
        String result = " = FAILED";
        for (int j = 0; j < array.length; j++) {
            if (array[j] == expectedResult[i]) {
                result = " = OK";
            }
            i++;
        }
        System.out.println(taskName + result);
    }
}
