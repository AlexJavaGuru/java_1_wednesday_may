package lv.javaguru.student_artjomsb_homework.homework4.level_7_senior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest(35, 40);
        calculatorTest.subTest(35, 15);
        calculatorTest.mulTest(5, 5);
        calculatorTest.divTest(40, 7);
        calculatorTest.isEvenTest(40);
        calculatorTest.isNotEvenTest(41);
    }

    void sumTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        check(calculator.sum(firstNumber, secondNumber) == 75, "Sum test");
    }

    void subTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        check(calculator.sub(firstNumber, secondNumber) == 20, "Sub test");
    }

    void mulTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        check(calculator.mul(firstNumber, secondNumber) == 25, "Mul test");

    }

    void divTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        check(calculator.div(firstNumber, secondNumber) == (firstNumber / secondNumber), "Div test");

    }

    void isEvenTest(int firstNumber) {
        Calculator calculator = new Calculator();
        check(calculator.isEven(firstNumber), "isEven test");
    }

    void isNotEvenTest(int firstNumber) {
        Calculator calculator = new Calculator();
        check(!calculator.isEven(firstNumber), "isEven test");
    }

    void check(boolean isPass, String testName) {
        if (isPass) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}