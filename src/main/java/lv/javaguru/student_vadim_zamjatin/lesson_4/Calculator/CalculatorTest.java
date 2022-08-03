package main.java.lv.javaguru.student_vadim_zamjatin.lesson_4.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.minusTests();
        calculatorTest.multiplyTests();
        calculatorTest.divise();
        calculatorTest.isEvenTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void minusTests() {
        int firstNumber = 5;
        int secondNumber = 3;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.minus(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void multiplyTests() {
        int firstNumber = 5;
        int secondNumber = 7;
        int expectedResult = 35;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void divise() {
        int firstNumber = 9;
        int secondNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        double realResult = calculator.divise(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 8;
        boolean expIsEven = true;
        Calculator calculator = new Calculator();
        boolean realIsEven = calculator.isEven(number);
        if (realIsEven == expIsEven) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }
}