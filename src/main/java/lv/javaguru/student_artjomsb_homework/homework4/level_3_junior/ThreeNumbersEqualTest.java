package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

public class ThreeNumbersEqualTest {
    public static void main(String[] args) {
        ThreeNumbersEqualTest runner = new ThreeNumbersEqualTest();
        int testNumber = (int) Math.floor(Math.random()*100);
        runner.allNumbersDifferent(5,15,25);
        runner.allNumbersSame(testNumber,testNumber,testNumber);
        runner.twoNumbersSame(testNumber,(int)Math.floor(Math.random()*100)-101,testNumber);
    }
    void allNumbersDifferent (int numOne, int numTwo, int numThree){
        ThreeNumbersEqual victim = new ThreeNumbersEqual();
        check(victim.numbersEquals(numOne,numTwo,numThree).equals("All numbers are different"), "Test all numbers are different");

    }
    void allNumbersSame (int numOne, int numTwo, int numThree) {
        ThreeNumbersEqual victim = new ThreeNumbersEqual();
        check(victim.numbersEquals(numOne, numTwo, numThree).equals("All numbers are equal"), "Test all numbers the same");
    }
    void twoNumbersSame (int numOne, int numTwo, int numThree) {
        ThreeNumbersEqual victim = new ThreeNumbersEqual();
        check(victim.numbersEquals(numOne, numTwo, numThree).equals("Neither all are equal or different"), "Test all numbers the same");
    }
    void check (boolean isPassed, String testName){
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
