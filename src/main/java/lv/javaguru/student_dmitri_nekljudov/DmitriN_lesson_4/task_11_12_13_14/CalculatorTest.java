package lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_11_12_13_14;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.sumSum();
        calculatorTest.sumSubtraction();
        calculatorTest.sumMultiplication();
        calculatorTest.sumDivision();
        calculatorTest.twoMaxNumbers();
        calculatorTest.twoMaxNumbersT();
        calculatorTest.twoMaxNumbersTt();
    }


    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int realResult = 15;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void sumSum() {
        int firstNumber = 5;
        int secondNumber = 15;
        int realResult = 20;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

    }

    public void sumSubtraction() {
        int firstNumber = 40;
        int secondNumber = 20;
        int realResult = 15;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

    }

    public void sumMultiplication() {
        int firstNumber = 40;
        int secondNumber = 20;
        int realResult = 600;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

    }

    public void sumDivision() {
        int firstNumber = 40;
        int secondNumber = 15;
        int realResult = 20;

        Calculator calculator = new Calculator();
        int expectedResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

    }


    public void twoMaxNumbers() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 30;
        int expectedResult = 10;
        int actualResult = calculator.twoMaxNumbers(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test : cool");
        } else {
            System.out.println("Test : fail");
        }
    }

    public void twoMaxNumbersT() {
        Calculator calculator = new Calculator();
        int firstNumber = 105;
        int secondNumber = 30;
        int expectedResult = 105;
        int actualResult = calculator.twoMaxNumbersT(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test : cool");
        } else {
            System.out.println("Test : fail");
        }
    }
    public void twoMaxNumbersTt() {
        Calculator calculator = new Calculator();
        int firstNumber =10;
        int secondNumber = 10;
        int expectedResult = 10;
        int actualResult = calculator.twoMaxNumbersTt(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("Test : cool");
        } else {
            System.out.println("Test : fail");
        }
    }
}