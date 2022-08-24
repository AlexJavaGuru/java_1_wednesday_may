package lv.javaguru.student_maksims_sokolovs.homework_lesson4.task11_12_13_14_15;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sum();
        calculatorTest.sub();
        calculatorTest.div();
        calculatorTest.mul();
        calculatorTest.maxOfTwoNumbersOne();
        calculatorTest.maxOfTwoNumbersTwo();
        calculatorTest.maxOfTwoNumbersThree();
        calculatorTest.maxOfThreeNumbersOne();
        calculatorTest.maxOfThreeNumbersTwo();
        calculatorTest.maxOfThreeNumbersThree();
        calculatorTest.maxOfThreeNumbersFour();
        calculatorTest.maxOfThreeNumbersFive();
    }

    public void sum() {
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

    public void sub() {
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

    public void div() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void mul() {
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

    public void maxOfTwoNumbersOne() {
        int firstNumber = 7;
        int secondNumber = 5;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two numbers test one = OK");
        } else {
            System.out.println("Max of two numbers test one = FAIL");
        }
    }

    public void maxOfTwoNumbersTwo() {
        int firstNumber = 5;
        int secondNumber = 7;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two numbers test two = OK");
        } else {
            System.out.println("Max of two numbers test two = FAIL");
        }
    }

    public void maxOfTwoNumbersThree() {
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of two numbers test three = OK");
        } else {
            System.out.println("Max of two numbers test three = FAIL");
        }
    }

    public void maxOfThreeNumbersOne() {
        int firstNumber = 7;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test one = OK");
        } else {
            System.out.println("Max of three numbers test one = FAIL");
        }
    }

    public void maxOfThreeNumbersTwo() {
        int firstNumber = 5;
        int secondNumber = 7;
        int thirdNumber = 3;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test two = OK");
        } else {
            System.out.println("Max of three numbers test two = FAIL");
        }
    }

    public void maxOfThreeNumbersThree() {
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 7;
        int expectedResult = thirdNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test three = OK");
        } else {
            System.out.println("Max of three numbers test three = FAIL");
        }
    }

    public void maxOfThreeNumbersFour() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 5;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test four = OK");
        } else {
            System.out.println("Max of three numbers test four = FAIL");
        }
    }

    public void maxOfThreeNumbersFive() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 7;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test five = OK");
        } else {
            System.out.println("Max of three numbers test five = FAIL");
        }
    }

}