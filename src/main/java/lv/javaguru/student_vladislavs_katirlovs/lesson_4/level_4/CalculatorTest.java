package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.multTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfTwoNumbersTestB();
        calculatorTest.maxOfTwoNumbersTestC();
        calculatorTest.maxOfThreeNumbersTest();
        calculatorTest.maxOfThreeNumbersTestB();
        calculatorTest.maxOfThreeNumbersTestC();
        calculatorTest.maxOfThreeNumbersTestD();
        calculatorTest.maxOfThreeNumbersTestE();
        calculatorTest.maxOfThreeNumbersTestF();
        calculatorTest.maxOfThreeNumbersTestG();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 30;
        int secondNumber = 13;
        int expectedResult = 17;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub Test = OK");
        } else {
            System.out.println("Sub Test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 6;
        int secondNumber = 9;
        int expectedResult = 54;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult Test = OK");
        } else {
            System.out.println("Mult Test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 33;
        int secondNumber = 3;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div Test = OK");
        } else {
            System.out.println("Div Test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is Even Test = OK");
        } else {
            System.out.println("Is Even Test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 7;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Two Numbers Test = OK");
        } else {
            System.out.println("Max Of Two Numbers Test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestB() {
        int firstNumber = 4;
        int secondNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Two Numbers Test B = OK");
        } else {
            System.out.println("Max Of Two Numbers Test B = FAIL");
        }
    }

    public void maxOfTwoNumbersTestC() {
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 3 & 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Two Numbers Test C = OK");
        } else {
            System.out.println("Max Of Two Numbers Test C = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 7;
        int thirdNumber = 4;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Three Numbers Test = OK");
        } else {
            System.out.println("Max Of Three Numbers Test = FAIL");
        }
    }

    public void maxOfThreeNumbersTestB() {
        int firstNumber = 7;
        int secondNumber = 10;
        int thirdNumber = 4;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Three Numbers Test B = OK");
        } else {
            System.out.println("Max Of Three Numbers Test B = FAIL");
        }
    }

    public void maxOfThreeNumbersTestC() {
        int firstNumber = 7;
        int secondNumber = 4;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Three Numbers Test C = OK");
        } else {
            System.out.println("Max Of Three Numbers Test C = FAIL");
        }
    }

    public void maxOfThreeNumbersTestD() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 8;
        int expectedResult = 10 & 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Three Numbers Test D = OK");
        } else {
            System.out.println("Max Of Three Numbers Test D = FAIL");
        }
    }

    public void maxOfThreeNumbersTestE() {
        int firstNumber = 6;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10 & 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Three Numbers Test E = OK");
        } else {
            System.out.println("Max Of Three Numbers Test E = FAIL");
        }
    }

    public void maxOfThreeNumbersTestF() {
        int firstNumber = 10;
        int secondNumber = 4;
        int thirdNumber = 10;
        int expectedResult = 10 & 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Three Numbers Test F = OK");
        } else {
            System.out.println("Max Of Three Numbers Test F = FAIL");
        }
    }

    public void maxOfThreeNumbersTestG() {
        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 11;
        int expectedResult = 11 & 11 & 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (expectedResult == realResult) {
            System.out.println("Max Of Three Numbers Test G = OK");
        } else {
            System.out.println("Max Of Three Numbers Test G = FAIL");
        }
    }


}
