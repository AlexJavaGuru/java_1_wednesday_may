package main.java.lv.javaguru.student_alija_alijeva.lesson4.level_4.task_11_12_13_14_15;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.difTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.maxNumber();
        calculatorTest.maxSecondNumber();
        calculatorTest.maxOneNumber();
        calculatorTest.isEven();
        calculatorTest.maxThreeNumbersOne();
        calculatorTest.maxThreeNumbersTwo();
        calculatorTest.maxThreeNumbersThree();
        calculatorTest.maxThreeNumbersFour();
        calculatorTest.maxThreeNumbersFive();
        calculatorTest.maxThreeNumbersSix();
        calculatorTest.maxThreeNumbersSeven();
        calculatorTest.maxThreeNumbersEight();
        calculatorTest.maxThreeNumbersNine();
        calculatorTest.maxThreeNumbersTen();
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
    public void difTest() {
        int firstNumber = 10;
        int secondNumber = 8;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.dif(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Dif test = OK");
        } else {
            System.out.println("Dif test = FAIL");
        }
    }
    public void multiplicationTest() {
        int firstNumber = 9;
        int secondNumber = 10;
        int expectedResult = 90;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiplication(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Division test  OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }
    public boolean isEven() {
        int number = 6;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test is OK");
        } else {
            System.out.println("isEven test is FAIL");
        }
        return expectedResult;
    }
    public void maxNumber() {
        int firstNumber = 6;
        int secondNumber = 5;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxNumber test is OK");
        } else {
            System.out.println("maxNumber test is FAIL");
        }
    }
    public void maxSecondNumber() {
        int firstNumber = 7;
        int secondNumber = 8;
        int expectedResult = 8;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxSecondNumber test is OK");
        } else {
            System.out.println("maxSecondNumber test is FAIL");
        }
    }
    public void maxOneNumber() {
        int firstNumber = 7;
        int secondNumber = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxNumber(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("maxOneNumber test is OK");
        } else {
            System.out.println("maxOneNumber test is FAIL");
        }
    }
    public void maxThreeNumbersOne() {
        int firstNumber = 9;
        int secondNumber = 7;
        int thirdNumber = 4;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersOne test is OK");
        } else {
            System.out.println("maxThreeNumbersOne test is FAIL");
        }
    }
    public void maxThreeNumbersTwo() {
        int firstNumber = 3;
        int secondNumber = 7;
        int thirdNumber = 4;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersTwo test is OK");
        } else {
            System.out.println("maxThreeNumbersTwo test is FAIL");
        }
    }
    public void maxThreeNumbersThree() {
        int firstNumber = 9;
        int secondNumber = 7;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersThree test is OK");
        } else {
            System.out.println("maxThreeNumbersThree test is FAIL");
        }
    }
    public void maxThreeNumbersFour() {
        int firstNumber = 7;
        int secondNumber = 7;
        int thirdNumber = 4;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersFour test is OK");
        } else {
            System.out.println("maxThreeNumbersFour test is FAIL");
        }
    }
    public void maxThreeNumbersFive() {
        int firstNumber = 9;
        int secondNumber = 7;
        int thirdNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersFive test is OK");
        } else {
            System.out.println("maxThreeNumbersFive test is FAIL");
        }
    }
    public void maxThreeNumbersSix() {
        int firstNumber = 9;
        int secondNumber = 90;
        int thirdNumber = 90;
        int expectedResult = 90;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersSix test is OK");
        } else {
            System.out.println("maxThreeNumbersSix test is FAIL");
        }
    }
    public void maxThreeNumbersSeven() {
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 12;
        int expectedResult = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersSeven test is OK");
        } else {
            System.out.println("maxThreeNumbersSeven test is FAIL");
        }
    }
    public void maxThreeNumbersEight() {
        int firstNumber = 90;
        int secondNumber = 50;
        int thirdNumber = 50;
        int expectedResult = 90;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersEight test is OK");
        } else {
            System.out.println("maxThreeNumbersEight test is FAIL");
        }
    }
    public void maxThreeNumbersNine() {
        int firstNumber = 4;
        int secondNumber = 70;
        int thirdNumber = 4;
        int expectedResult = 70;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersNine test is OK");
        } else {
            System.out.println("maxThreeNumbersNine test is FAIL");
        }
    }
    public void maxThreeNumbersTen() {
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 9;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.threeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("maxThreeNumbersTen test is OK");
        } else {
            System.out.println("maxThreeNumbersTen test is FAIL");
        }
    }
}
