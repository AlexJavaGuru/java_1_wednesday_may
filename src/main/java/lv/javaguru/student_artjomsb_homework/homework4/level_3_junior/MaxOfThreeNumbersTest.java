package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

public class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest runner = new MaxOfThreeNumbersTest();
        runner.firstNumberLargest(50, 50, 2);
        runner.secondNumberLargest(1, 47, 47);
        runner.thirdNumberLargest(3, 3, 56);

    }

    void firstNumberLargest(int numOne, int numTwo, int numThree) {
        MaxOfThreeNumbers victim = new MaxOfThreeNumbers();
        check(victim.maxOfThreeNumbers(numOne, numTwo, numThree) == numOne, "Test the first number largest");
    }

    void secondNumberLargest(int numOne, int numTwo, int numThree) {
        MaxOfThreeNumbers victim = new MaxOfThreeNumbers();
        check(victim.maxOfThreeNumbers(numOne, numTwo, numThree) == numTwo, "Test the second number largest");
    }

    void thirdNumberLargest(int numOne, int numTwo, int numThree) {
        MaxOfThreeNumbers victim = new MaxOfThreeNumbers();
        check(victim.maxOfThreeNumbers(numOne, numTwo, numThree) == numThree, "Test the second number largest");
    }

    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
