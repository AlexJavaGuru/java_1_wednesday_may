package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.isOddTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();
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

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 35;
        int secondNumber = 10;
        double expectedResult = 3.5;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 14;
        boolean expIsEven = true;
        Calculator calculator = new Calculator();
        boolean realIsEven = calculator.isEven(number);
        if (realIsEven == expIsEven) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }

    public void isOddTest() {
        int number = 17;
        boolean expIsEven = false;
        Calculator calculator = new Calculator();
        boolean realIsEven = calculator.isEven(number);
        if (realIsEven == expIsEven) {
            System.out.println("Odd test = OK");
        } else {
            System.out.println("Odd test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int first = 7;
        int second = 6;
        int expMax = 7;
        Calculator calculator = new Calculator();
        int realMax = calculator.maxOfTwoNumbers(first, second);
        if (realMax == expMax) {
            System.out.println("Max two test = OK");
        } else {
            System.out.println("Max two test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int first = 22;
        int second = 45;
        int third = 6;
        int expMax = 45;
        Calculator calculator = new Calculator();
        int realMax = calculator.maxOfThreeNumbers(first, second, third);
        if (realMax == expMax) {
            System.out.println("Max three test = OK");
        } else {
            System.out.println("Max three test = FAIL");
        }
    }
}



