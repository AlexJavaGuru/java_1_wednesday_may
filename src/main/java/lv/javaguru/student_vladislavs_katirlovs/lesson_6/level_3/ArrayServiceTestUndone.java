package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceTestUndone {

    public static void main(String[] args) {

        ArrayServiceTestUndone test = new ArrayServiceTestUndone();
        test.isContainTest();
        test.isNotContainTest();
        test.specNumberCountTest();
        test.noSpecNumberCountTest();
        test.firstReplacedTest();
        test.firstNotReplacedTest();
        test.allReplacedTest();
        test.allNotReplacedTest();
        test.isReverted();
        test.isRevertedB();

    }

    public void isContainTest() {
        int numberToSearch = 33;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 33;
        array[2] = 87;
        array[3] = 0;
        boolean actualResult = arrayService.contains(array, numberToSearch);
        check(actualResult == expectedResult, "Is Contain Test" );
    }

    public void isNotContainTest() {
        int numberToSearch = 34;
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 33;
        array[2] = 87;
        array[3] = 0;
        boolean actualResult = arrayService.contains(array, numberToSearch);
        check(actualResult == expectedResult, "Is Not Contain Test" );
    }

    public void specNumberCountTest() {
        int numberToSearch = 1;
        int expectedResult = 3;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 1;
        array[2] = 99;
        array[3] = 1;
        int actualResult = arrayService.specNumberCount(array, numberToSearch);
        check(actualResult == expectedResult, "Specified Numbers Count Test");
    }

    public void noSpecNumberCountTest() {
        int numberToSearch = 3;
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 1;
        array[2] = 99;
        array[3] = 1;
        int actualResult = arrayService.specNumberCount(array, numberToSearch);
        check(actualResult == expectedResult, "Specified Numbers Count Negative Test");
    }

    public void firstReplacedTest() {
        int newNumber = 10;
        int numberToReplace = 3;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 3;
        boolean actualResult = arrayService.replaceFirst(array, numberToReplace, newNumber);
        check(actualResult == expectedResult, "First Replaced Test");
    }


    public void firstNotReplacedTest() {
        int newNumber = 10;
        int numberToReplace = 3;
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 2;
        array[3] = 2;
        boolean actualResult = arrayService.replaceFirst(array, numberToReplace, newNumber);
        check(actualResult == expectedResult, "First Not Replaced Test");
    }

    public void allReplacedTest() {
        int newNumber = 10;
        int numberToReplace = 3;
        int expectedResult = 4;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 3;
        array[1] = 3;
        array[2] = 3;
        array[3] = 3;
        int actualResult = arrayService.replaceAll(array, numberToReplace, newNumber);
        check(actualResult == expectedResult, "All Replaced Test");
    }

    public void allNotReplacedTest() {
        int newNumber = 10;
        int numberToReplace = 123;
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int[] array = new int[4];
        array[0] = 3;
        array[1] = 3;
        array[2] = 3;
        array[3] = 3;
        int actualResult = arrayService.replaceAll(array, numberToReplace, newNumber);
        check(actualResult == expectedResult, "All Replaced Negative Test");
    }

    public void isReverted() {
        int[] array = {1, 2, 3, 4};
        String expectedResult = "[4, 3, 2, 1]";
        ArrayService arrayService = new ArrayService();
        String actualResult = Arrays.toString(arrayService.revert(array));
        check(actualResult.equals(expectedResult), "Revert Test");
    }

    public void isRevertedB() {
        int[] array = {32, 64, 128, 256, 512, 1024, 2048};
        String expectedResult = "[2048, 1024, 512, 256, 128, 64, 32]";
        ArrayService arrayService = new ArrayService();
        String actualResult = Arrays.toString(arrayService.revert(array));
        check(actualResult.equals(expectedResult), "Revert Test B");
    }

    public void check(boolean condition, String testName){
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
