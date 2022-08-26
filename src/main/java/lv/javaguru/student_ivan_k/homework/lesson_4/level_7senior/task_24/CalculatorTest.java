package lv.javaguru.student_ivan_k.homework.lesson_4.level_7senior.task_24;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.isNotEvenTest();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);
        int expectedResult = 75;
        chekResult(actualResult, expectedResult, "SUM tets");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sub(firstNumber, secondNumber);
        int expectedResult = 20;
        chekResult(actualResult, expectedResult, "SUBTRACTION test");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.mul(firstNumber, secondNumber);
        int expectedResult = 25;
        chekResult(actualResult, expectedResult, "MULTIPLICATION test");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        double actualResult = calculator.div(firstNumber, secondNumber);
        int expectedResult = 5;
        chekResult(actualResult, expectedResult, "DIVISION test");
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean condition = calculator.isEven(40);
        chekForBool(condition, "IsEvian test");
    }

    public void isNotEvenTest() {
        Calculator calculator = new Calculator();
        boolean condition = calculator.isEven(41);
        chekForBool(!condition, "IsNotEvian test");


    }

    void chekResult(double actualResult, int expectedResult, String nameOfTest) {
        if (actualResult == expectedResult) {
            System.out.println(nameOfTest + " has been PASSED.OK");
        } else {
            System.out.println(nameOfTest + " has been NOT passed!!! ");
        }
    }

    void chekResult(int actualResult, int expectedResult, String nameOfTest) {
        if (actualResult == expectedResult) {
            System.out.println(nameOfTest + " has been PASSED.OK");
        } else {
            System.out.println(nameOfTest + " has been NOT passed!!! ");
        }
    }

    void chekForBool(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " has been PASSED.OK");
        } else {
            System.out.println(nameOfTest + " has been NOT passed!!! ");
        }
    }
}
