package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTestFirst();
        calculatorTest.isEvenTestSecond();
        calculatorTest.maxOfTwoNumbersFirst();
        calculatorTest.maxOfTwoNumbersSecond();
        calculatorTest.maxOfTwoNumbersThird();
        calculatorTest.maxOfThreeNumbersFirst();
        calculatorTest.maxOfThreeNumbersSecond();
        calculatorTest.maxOfThreeNumbersThird();
        calculatorTest.maxOfThreeNumbersFourth();
        calculatorTest.maxOfThreeNumbersFifth();


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
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 12;
        int secondNumber = 5;
        double expectedResult = 2.4;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }

    }

    public void isEvenTestFirst() {
        int number = 5;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEvenFirst test = OK");
        } else {
            System.out.println("isEvenFirst test = FAIL");
        }


    }

    public void isEvenTestSecond() {
        int number = 8;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEvenSecond test = OK");
        } else {
            System.out.println("isEvenSecond test = FAIL");
        }
    }

    public void maxOfTwoNumbersFirst() {
        int firstNumber = 10;
        int secondNumber = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersFirst test = OK");
        } else {
            System.out.println("maxOfTwoNumbersFirst = FAIL");
        }
    }

    public void maxOfTwoNumbersSecond() {
        int firstNumber = 6;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersSecond test = OK");
        } else {
            System.out.println("maxOfTwoNumbersSecond = FAIL");
        }
    }

    public void maxOfTwoNumbersThird() {
        int firstNumber = 20;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbersThird test = OK");
        } else {
            System.out.println("maxOfTwoNumbersThird = FAIL");
        }
    }

    public void maxOfThreeNumbersFirst() {
        int firstNumber = 30;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFirst test = OK");
        } else {
            System.out.println("maxOfThreeNumbersFirst = FAIL");
        }
    }

    public void maxOfThreeNumbersSecond() {
        int firstNumber = 30;
        int secondNumber = 50;
        int thirdNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersSecond test = OK");
        } else {
            System.out.println("maxOfThreeNumbersSecond = FAIL");
        }
    }

    public void maxOfThreeNumbersThird() {
        int firstNumber = 30;
        int secondNumber = 50;
        int thirdNumber = 80;
        int expectedResult = 80;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersThird test = OK");
        } else {
            System.out.println("maxOfThreeNumbersThird = FAIL");
        }
    }

    public void maxOfThreeNumbersFourth() {
        int firstNumber = 50;
        int secondNumber = 50;
        int thirdNumber = 40;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFourth test = OK");
        } else {
            System.out.println("maxOfThreeNumbersFourth = FAIL");
        }
    }

    public void maxOfThreeNumbersFifth() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOfThreeNumbersFifth test = OK");
        } else {
            System.out.println("maxOfThreeNumbersFifth = FAIL");
        }
    }
}