package lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class SmallestNumberTest {
    public static void main(String[] args) {
        SmallestNumberTest runner = new SmallestNumberTest();
        runner.numberOneSmallest(43,581);
        runner.numberTwoIsSmallest(504,-432);
        runner.numberEqual(4237,4237);
    }

    void numberOneSmallest(int numOne, int numTwo) {
        SmallestNumber smallest = new SmallestNumber();
        check(smallest.smallestNumber(numOne, numTwo) == numOne, "Number one is largest");
    }

    void numberTwoIsSmallest(int numOne, int numTwo) {
        SmallestNumber smallest = new SmallestNumber();
        check(smallest.smallestNumber(numOne, numTwo) == numTwo, "Number two is largest");
    }

    void numberEqual(int numOne, int numTwo) {
        SmallestNumber smallest = new SmallestNumber();
        check(smallest.smallestNumber(numOne, numTwo) == numTwo && smallest.smallestNumber(numOne, numTwo) == numOne, "Numbers are equal");
    }

    void check(boolean result, String testName) {
        if (result) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
