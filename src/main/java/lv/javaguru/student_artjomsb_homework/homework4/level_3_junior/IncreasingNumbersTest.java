package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

public class IncreasingNumbersTest {
    public static void main(String[] args) {
        IncreasingNumbersTest runner = new IncreasingNumbersTest();
        runner.numberAreDecreasing();
        runner.numberAreIncreasing();
        runner.randomSequence();
    }

    void numberAreIncreasing() {
        IncreasingNumbers victim = new IncreasingNumbers();
        check(victim.increasingNumber(1, 2, 3).equals("increasing"), "Test all numbers are Increasing");
    }

    void numberAreDecreasing() {
        IncreasingNumbers victim = new IncreasingNumbers();
        check(victim.increasingNumber(3, 2, 1).equals("decreasing"), "Test all numbers are Decreasing");
    }

    void randomSequence() {
        IncreasingNumbers victim = new IncreasingNumbers();
        check(victim.increasingNumber((int) Math.floor(Math.random() * 100) + 100, (int) Math.floor(Math.random() * 100) - 101, (int) Math.floor(Math.random() * 100) + 100).equals("Neither increasing or decreasing order"), "Test all numbers are random");
    }

    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}

