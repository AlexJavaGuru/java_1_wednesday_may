package lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_11_12_14_15;

class CalculatorTest {

    final Calculator calculator = new Calculator();

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
        double result = calculator.sumAddition(firstNumber, secondNumber);
        check(result == 15.0, "Test sum addition");
    }

    public void sumSubtractionTest() {
        int firstNumber = 100;
        int secondNumber = 10;
        double result = calculator.sumSubtraction(firstNumber, secondNumber);
        check(result == 90.0, "Test sum subtraction");
    }

    public void sumDivisionTest() {
        int firstNumber = 101;
        int secondNumber = 2;
        double result = calculator.sumDivision(firstNumber, secondNumber);
        check(result == 50.5, "Test sum division");
    }

    public void sumMultiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        double result = calculator.sumMultiplication(firstNumber, secondNumber);
        check(result == 100.0, "Test sum multiplication");
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 1;
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(result == firstNumber, "Test max of two numbers");
    }

    public void maxOfTwoNumbersTestTwo() {
        int firstNumber = 1;
        int secondNumber = 3;
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(result == secondNumber, "Test 2 max of two numbers");
    }

    public void maxOfTwoNumbersTestThree() {
        int firstNumber = 11;
        int secondNumber = 11;
        int result   = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        check(result == firstNumber, "Test 3 equal numbers");
    }

    public void maxOfThreeNumbers() {
        int firstNumber = 100;
        int secondNumber = 1;
        int thirdNumber = 10;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(result == firstNumber, "Test 1 max of three numbers");
    }

    public void maxOfThreeNumbersTwo() {
        int firstNumber = 50;
        int secondNumber = 100;
        int thirdNumber = 10;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(result == secondNumber, "Test 2 max of three numbers");
    }

    public void maxOfThreeNumbersThree() {
        int firstNumber = 50;
        int secondNumber = 1;
        int thirdNumber = 100;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(result == thirdNumber, "Test 3 max of three numbers");
    }

    public void maxOfThreeNumbersFour() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 1;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(result == secondNumber, "Test 4 two first numbers equal and big than third number");
    }

    public void maxOfThreeNumbersFive() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 50;
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        check(result == secondNumber, "Test 5 equal 3 numbers");
    }

    public void check(boolean result, String TaskName) {
        if (result) {
            System.out.println(TaskName + " = OK");
        } else {
            System.out.println(TaskName + " = FAIL");
        }
    }
}