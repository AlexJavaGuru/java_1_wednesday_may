package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbers1();
        calculatorTest.maxOfThreeNumbers2();
        calculatorTest.maxOfThreeNumbers3();
        calculatorTest.maxOfThreeNumbers4();
        calculatorTest.maxOfThreeNumbers5();
        calculatorTest.maxOfThreeNumbers6();
        calculatorTest.maxOfThreeNumbers7();

    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = Passed");
        } else {
            System.out.println("Sum test = Failed");
        }
    }

    public void minTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        int realResult = calculator.min(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Min test = Passed");
        } else {
            System.out.println("Min test = Failed");
        }
    }

    public void multTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult test = Passed");
        } else {
            System.out.println("Mult test = Failed");
        }
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div Test = Passed");
        } else {
            System.out.println("Div test = Failed");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        int number = 10;
        boolean actualResult = calculator.isEven(number);
        if (actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    public void maxOfTwoNumbersTest1() {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        int actualResult = calculator.maxOfTwoNumbers1(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test has passed ");
        } else {
            System.out.println("Test has failed ");
        }
    }

    public void maxOfTwoNumbersTest2() {
        Calculator calculator = new Calculator();
        int firstNumber = 20;
        int secondNumber = 30;
        int expectedResult = 30;
        int actualResult = calculator.maxOfTwoNumbers2(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test has passed ");
        } else {
            System.out.println("Test has failed ");
        }
    }

    public void maxOfTwoNumbersTest3() {
        Calculator calculator = new Calculator();
        int firstNumber = 40;
        int secondNumber = 40;
        int expectedResult = 40;
        int actualResult = calculator.maxOfTwoNumbers3(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test has passed ");
        } else {
            System.out.println("Test has failed ");
        }
    }


    public void maxOfThreeNumbers1() {
        Calculator calculator = new Calculator();
        int first = 5;
        int second = 4;
        int third = 3;
        int expectedResult = 5;
        int actualResult = calculator.maxOfThreeNumbers(first, second, third);
        check(expectedResult, actualResult, "One ");
    }

    public void maxOfThreeNumbers2() {
        Calculator calculator = new Calculator();
        int first = 4;
        int second = 5;
        int third = 3;
        int expectedResult = 5;
        int actualResult = calculator.maxOfThreeNumbers(first, second, third);
        check(expectedResult, actualResult, "Two ");
    }

    public void maxOfThreeNumbers3() {
        Calculator calculator = new Calculator();
        int first = 3;
        int second = 4;
        int third = 5;
        int expectedResult = 5;
        int actualResult = calculator.maxOfThreeNumbers(first, second, third);
        check(expectedResult, actualResult, "Three ");
    }

    public void maxOfThreeNumbers4() {
        Calculator calculator = new Calculator();
        int first = 5;
        int second = 5;
        int third = 3;
        int expectedResult = 5;
        int actualResult = calculator.maxOfThreeNumbers(first, second, third);
        check(expectedResult, actualResult, "Three ");
    }

    public void maxOfThreeNumbers5() {
        Calculator calculator = new Calculator();
        int first = 3;
        int second = 5;
        int third = 5;
        int expectedResult = 5;
        int actualResult = calculator.maxOfThreeNumbers(first, second, third);
        check(expectedResult, actualResult, "Five ");
    }

    public void maxOfThreeNumbers6() {
        Calculator calculator = new Calculator();
        int first = 5;
        int second = 4;
        int third = 5;
        int expectedResult = 5;
        int actualResult = calculator.maxOfThreeNumbers(first, second, third);
        check(expectedResult, actualResult, "Six ");
    }

    public void maxOfThreeNumbers7() {
        Calculator calculator = new Calculator();
        int first = 5;
        int second = 5;
        int third = 5;
        int expectedResult = 5;
        int actualResult = calculator.maxOfThreeNumbers(first, second, third);
        check(expectedResult, actualResult, "Seven ");
    }


    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + "has passed");
        } else {
            System.out.println(testName + "has failed");
        }
    }
}

