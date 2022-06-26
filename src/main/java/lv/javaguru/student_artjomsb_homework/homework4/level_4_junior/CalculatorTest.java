package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_4_junior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest(10, 5);
        calculatorTest.divideTest(10, 5);
        calculatorTest.multiplyTest(10, 5);
        calculatorTest.subtractTest(10, 5);
        calculatorTest.isEven(6);
        calculatorTest.isOdd(7);
        calculatorTest.firstNumberLargest(10,5);
        calculatorTest.secondNumberLargest(5,10);
        calculatorTest.numbersAreEqual(10,10);
        calculatorTest.firstNumberLargest(50, 50, 2);
        calculatorTest.secondNumberLargest(1, 47, 47);
        calculatorTest.thirdNumberLargest(3, 3, 56);
        calculatorTest.threeNumberAreEqual( 12,12,12);
    }

    void sumTest(int numOne, int numTwo) {
        int expectedResult = numOne + numTwo;
        Calculator victim = new Calculator();
        check(victim.sum(numOne, numTwo) == expectedResult, "Test sum of two numbers");
    }

    void subtractTest(int numOne, int numTwo) {
        int expectedResult = numOne - numTwo;
        Calculator victim = new Calculator();
        check(victim.subtraction(numOne, numTwo) == expectedResult, "Test subtract of two numbers");
    }

    void multiplyTest(int numOne, int numTwo) {
        int expectedResult = numOne * numTwo;
        Calculator victim = new Calculator();
        check(victim.multiply(numOne, numTwo) == expectedResult, "Test multiply of two numbers");
    }

    void divideTest(int numOne, int numTwo) {
        int expectedResult = numOne / numTwo;
        Calculator victim = new Calculator();
        check(victim.divide(numOne, numTwo) == expectedResult, "Test divide of two numbers");
    }

    void isEven(int number) {
        Calculator victim = new Calculator();
        check(victim.isEven(number), "Test the even number");
    }
    void isOdd(int number) {
        Calculator victim = new Calculator();
        check(!victim.isEven(number), "Test the odd number");
    }
    void firstNumberLargest(int numOne,int numTwo){
        Calculator victim = new Calculator();
        check(victim.maxOfTwoNumbers(numOne,numTwo) == numOne, "Test the first number are Largest");
    }
    void secondNumberLargest(int numOne,int numTwo){
        Calculator victim = new Calculator();
        check(victim.maxOfTwoNumbers(numOne,numTwo) == numTwo, "Test the second number are Largest");
    }
    void numbersAreEqual(int numOne,int numTwo){
        Calculator victim = new Calculator();
        check(victim.maxOfTwoNumbers(numOne,numTwo) == numTwo && victim.maxOfTwoNumbers(numOne,numTwo) == numOne, "Test the number are equal");
    }
    void firstNumberLargest(int numOne, int numTwo, int numThree) {
        Calculator victim = new Calculator();
        check(victim.maxOfThreeNumbers(numOne, numTwo, numThree) == numOne, "Test the first number largest");
    }

    void secondNumberLargest(int numOne, int numTwo, int numThree) {
        Calculator victim = new Calculator();
        check(victim.maxOfThreeNumbers(numOne, numTwo, numThree) == numTwo, "Test the second number largest");
    }

    void thirdNumberLargest(int numOne, int numTwo, int numThree) {
        Calculator victim = new Calculator();
        check(victim.maxOfThreeNumbers(numOne, numTwo, numThree) == numThree, "Test the second number largest");
    }
    void threeNumberAreEqual(int numOne, int numTwo, int numThree) {
        Calculator victim = new Calculator();
        int result =victim.maxOfThreeNumbers(numOne, numTwo, numThree);
        check(result == numThree && result == numOne && result == numTwo, "Test the all numbers are equal");
    }
    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
