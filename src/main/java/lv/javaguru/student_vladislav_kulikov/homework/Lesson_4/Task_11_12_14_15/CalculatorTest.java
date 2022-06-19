package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_4.Task_11_12_14_15;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumAdditionTest();
        calculatorTest.sumSubtractionTest();
        calculatorTest.sumDivisionTest();
        calculatorTest.sumMultiplicationTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumbersTestTwo();
        calculatorTest.maxOfTwoNumbersTestThree();
        calculatorTest.maxOfThreeNumbers();
        calculatorTest.maxOfThreeNumbersTwo();
        calculatorTest.maxOfThreeNumbersThree();
        calculatorTest.maxOfThreeNumbersFour();
        calculatorTest.maxOfThreeNumbersFive();
    }

    public void sumAdditionTest() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sumAddition(firstNumber, secondNumber);
        check(expectedResult, realResult, "Test sum addition");
    }

    public void sumSubtractionTest() {
        int firstNumber = 100;
        int secondNumber = 10;
        int expectedResult = 90;
        Calculator calculator = new Calculator();
        int realResult = calculator.sumSubtraction(firstNumber, secondNumber);
        check(expectedResult, realResult, "Test sum subtraction");
    }

    public void sumDivisionTest() {
        int firstNumber = 100;
        int secondNumber = 2;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.sumDivision(firstNumber, secondNumber);
        check(expectedResult, realResult, "Test sum division");
    }

    public void sumMultiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.sumMultiplication(firstNumber, secondNumber);
        check(expectedResult, realResult, "Test sum multiplication");
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 1;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, realResult, "Test max of two numbers");
    }

    public void maxOfTwoNumbersTestTwo() {
        int firstNumber = 1;
        int secondNumber = 3;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, realResult, "Test 2 max of two numbers");
    }

    public void maxOfTwoNumbersTestThree() {
        int firstNumber = 11;
        int secondNumber = 11;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(expectedResult, realResult, "Test 3 equal numbers");
    }

    public void maxOfThreeNumbers() {
        int firstNumber = 100;
        int secondNumber = 1;
        int thirdNumber = 10;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, realResult, "Test 1 max of three numbers");
    }

    public void maxOfThreeNumbersTwo() {
        int firstNumber = 50;
        int secondNumber = 100;
        int thirdNumber = 10;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, realResult, "Test 2 max of three numbers");
    }

    public void maxOfThreeNumbersThree() {
        int firstNumber = 50;
        int secondNumber = 1;
        int thirdNumber = 100;
        int expectedResult = thirdNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, realResult, "Test 3 max of three numbers");
    }

    public void maxOfThreeNumbersFour() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 1;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, realResult, "Test 4 two first numbers equal and big than third number");
    }

    public void maxOfThreeNumbersFive() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 50;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(expectedResult, realResult, "Test 5 equal 3 numbers");
    }

    public void check(int expectedResult, int realResult, String TaskName) {
        if (expectedResult == realResult) {
            System.out.println(TaskName + " = OK");
        } else {
            System.out.println(TaskName + " = FAIL");
        }
    }
}