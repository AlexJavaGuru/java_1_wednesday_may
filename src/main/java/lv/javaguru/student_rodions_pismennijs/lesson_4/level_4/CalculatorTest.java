package lv.javaguru.student_rodions_pismennijs.lesson_4.level_4;

class CalculatorTest {
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
        int firstNumber = 30;
        int secondNumber = 10;
        int expectedResult = 20;
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
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 20;
        int secondNumber = 8;
        double expectedResult = 2.5;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 24;
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
        int number = 23;
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
        int first = 15;
        int second = 8;
        int expMax = 15;
        Calculator calculator = new Calculator();
        int realMax = calculator.maxOfTwoNumbers(first, second);
        if (realMax == expMax) {
            System.out.println("Max two test = OK");
        } else {
            System.out.println("Max two test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int first = 10;
        int second = 50;
        int third = 50;
        int expMax = 50;
        Calculator calculator = new Calculator();
        int realMax = calculator.maxOfThreeNumbers(first, second, third);
        if (realMax == expMax) {
            System.out.println("Max three test = OK");
        } else {
            System.out.println("Max three test = FAIL");
        }
    }
}
