package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class LargestNumberTest {
    public static void main(String[] args) {
        LargestNumberTest runner = new LargestNumberTest();
        runner.numberOneBiggest(99, 21);
        runner.numberTwoIsLargest(-31, 42);
        runner.numberEqual(37, 37);
    }

    void numberOneBiggest(int numOne, int numTwo) {
        LargestNumber largest = new LargestNumber();
        check(largest.largestNumber(numOne, numTwo) == numOne, "Number one is largest");
    }

    void numberTwoIsLargest(int numOne, int numTwo) {
        LargestNumber largest = new LargestNumber();
        check(largest.largestNumber(numOne, numTwo) == numTwo, "Number two is largest");
    }

    void numberEqual(int numOne, int numTwo) {
        LargestNumber largest = new LargestNumber();
        check(largest.largestNumber(numOne, numTwo) == numTwo && largest.largestNumber(numOne, numTwo) == numOne, "Numbers are equal");
    }

    void check(boolean result, String testName) {
        if (result) {
            System.out.println("Test - " + testName + " , Passed!");
        } else {
            System.out.println("Test - " + testName + " , FAILED");
        }
    }
}
