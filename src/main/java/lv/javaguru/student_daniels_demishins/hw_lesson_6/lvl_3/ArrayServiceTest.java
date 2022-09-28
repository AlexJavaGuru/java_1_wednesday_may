package lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest runner = new ArrayServiceTest();
        runner.findNumberInArrayPositive();
        runner.findNumberInArrayNegative();
        runner.countOccurrences();
        runner.countOccurrencesNegative();
        runner.replaceFirst();
        runner.replaceFirstNegative();
    }


    public void findNumberInArrayPositive() {
        ArrayService victim = new ArrayService();
        int[] Array = {20, 30, 51, 1, 25};
        check(victim.isArrayNumbers(Array, 1), "Find Number in Array Positive Test");
    }

    public void findNumberInArrayNegative() {
        ArrayService victim = new ArrayService();
        int[] Array = {20, 30, 51, 1, 25};
        check(victim.isArrayNumbers(Array, 2), "Find Number in Array Negative Test");
    }

    public void countOccurrences() {
        ArrayService victim = new ArrayService();
        int[] Array = {20, 30, 20, 20, 1, 25, 58};
        check((victim.countNumbersInArray(Array, 20) == 3), "Test Count Occurrences");
    }

    public void countOccurrencesNegative() {
        ArrayService victim = new ArrayService();
        int[] Array = {20, 30, 20, 20, 1, 25, 58};
        check((victim.countNumbersInArray(Array, 2) == 0), "Test Count Occurrences Negative");
    }

    public void replaceFirst() {
        ArrayService victim = new ArrayService();
        int[] Array = {21, 30, 5, 57, 61, 23, 99};
        int[] expectedResult = {41, 30, 5, 57, 61, 23, 99};
        check((victim.replaceFirstInArray(Array, 21, 41) && Arrays.equals(Array, expectedResult)), "Test Replace First Number");
    }

    public void replaceFirstNegative() {
        ArrayService victim = new ArrayService();
        int[] Array = {5, 16, 25, 87, 99, 10, 67};
        int[] expectedResult = {5, 16, 25, 87, 99, 10, 67};
        check((victim.replaceFirstInArray(Array, 5, 5) && Arrays.equals(Array, expectedResult)), "Test Replace First Number Negative");
    }


    public void check(boolean isPassed, String name) {
        if (isPassed) {
            System.out.println(name + "  has successed!");
        } else {
            System.out.println(name + " has failed!");
        }
    }
}


