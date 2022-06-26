package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class SmallestNumberTest {
    public static void main(String[] args) {
        SmallestNumberTest runner = new SmallestNumberTest();
        int number = (int) Math.floor(Math.random() * 100);
        runner.numberOneSmallest((int) Math.floor(Math.random() * 100) - 101, (int) Math.floor(Math.random() * 100));
        runner.numberTwoIsSmallest((int) Math.floor(Math.random() * 100), (int) Math.floor(Math.random() * 100) - 101);
        runner.numberEqual(number, number);
    }

    void numberOneSmallest(int numOne, int numTwo) {
        SmallestNumber smallest = new SmallestNumber();
        System.out.println(numOne + " " + numTwo);
        check(smallest.smallestNumber(numOne, numTwo) == numOne, "Number one is largest");
    }

    void numberTwoIsSmallest(int numOne, int numTwo) {
        SmallestNumber smallest = new SmallestNumber();
        System.out.println(numOne + " " + numTwo);
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
