package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.isOddTest();
        calculatorTest.maxOfTwoNumbersTestOne();
        calculatorTest.maxOfTwoNumbersTestTwo();
        calculatorTest.maxOfTwoNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestOne();
        calculatorTest.maxOfThreeNumbersTestTwo();
        calculatorTest.maxOfThreeNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestFour();
        calculatorTest.maxOfThreeNumbersTestFive();
        calculatorTest.maxOfThreeNumbersTestSix();
        calculatorTest.maxOfThreeNumbersTestSeven();
        calculatorTest.maxOfThreeNumbersTestEight();
        calculatorTest.maxOfThreeNumbersTestNine();
        calculatorTest.maxOfThreeNumbersTestTen();
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
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 30;
        int secondNumber = 5;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 2;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is even test = OK");
        } else {
            System.out.println("Is even test = FAIL");
        }

    }

    public void isOddTest() {
        int number = 3;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is odd test = OK");
        } else {
            System.out.println("Is odd test = FAIL");
        }
    }

    public void maxOfTwoNumbersTestOne() {
        int firstNumber = 7;
        int secondNumber = 3;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test 1 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test 1 = FAIL");
        }
    }

    public void maxOfTwoNumbersTestTwo() {
        int firstNumber = 2;
        int secondNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test 2 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test 2 = FAIL");
        }
    }

    public void maxOfTwoNumbersTestThree() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test 3 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test 3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestOne() {
        int firstNumber = 71;
        int secondNumber = 23;
        int thirdNumber = 11;
        int expectedResult = 71;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 1 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 1 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestTwo() {
        int firstNumber = 17;
        int secondNumber = 66;
        int thirdNumber = 23;
        int expectedResult = 66;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 2 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 2 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestThree() {
        int firstNumber = 4;
        int secondNumber = 12;
        int thirdNumber = 54;
        int expectedResult = 54;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 3 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFour() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 3;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 4 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 4 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestFive() {
        int firstNumber = 14;
        int secondNumber = 14;
        int thirdNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 5 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 5 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestSix() {
        int firstNumber = 14;
        int secondNumber = 6;
        int thirdNumber = 14;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 1 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 1 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestSeven() {
        int firstNumber = 34;
        int secondNumber = 37;
        int thirdNumber = 34;
        int expectedResult = 37;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 7 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 7 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestEight() {
        int firstNumber = 71;
        int secondNumber = 23;
        int thirdNumber = 23;
        int expectedResult = 71;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 8 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 8 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestNine() {
        int firstNumber = 11;
        int secondNumber = 23;
        int thirdNumber = 23;
        int expectedResult = 23;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 9 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 9 = FAIL");
        }
    }

    public void maxOfThreeNumbersTestTen() {
        int firstNumber = 71;
        int secondNumber = 71;
        int thirdNumber = 71;
        int expectedResult = 71;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbers test 10 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 10 = FAIL");
        }
    }
}



