package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_7;

public class CalculatorTest {public static void main(String[] args) {
    CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.sumTest();
    calculatorTest.subTest();
    calculatorTest.mulTest();
    calculatorTest.divTest();
    calculatorTest.isEvenTest();
}

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        check(result == 75, "Sum test");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        check(result == 20, "Sub test");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        check(result == 25, "Mul test");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        check(result == 5, "Div test");
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        check(result, "Even test");

    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed");
        }
    }
}

