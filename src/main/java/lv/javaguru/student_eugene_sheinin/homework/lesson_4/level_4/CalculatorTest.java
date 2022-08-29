package lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();
    }

    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные

        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать

        this.check(expectedResult, actualResult,"test sum");
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;

        Calculator calculator = new Calculator();
        int actualResult = calculator.sub(firstNumber, secondNumber);

        this.check(expectedResult, actualResult,"test sub");
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;

        Calculator calculator = new Calculator();
        int actualResult = calculator.mul(firstNumber, secondNumber);

        this.check(expectedResult, actualResult,"test mul");
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        double expectedResult = 2.0;

        Calculator calculator = new Calculator();
        double actualResult = calculator.div(firstNumber, secondNumber);

        this.check(expectedResult, actualResult,"test div");
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        this.check(expectedResult, actualResult,"max Of Two Numbers Test ");

        firstNumber = 5;
        secondNumber = 10;
        expectedResult = 10;
        actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        this.check(expectedResult, actualResult,"max Of Two Numbers Test ");

        firstNumber = 5;
        secondNumber = 5;
        expectedResult = 5;
        actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        this.check(expectedResult, actualResult,"max Of Two Numbers Test ");
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 3;

        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        this.check(expectedResult, actualResult, "max Of Three Numbers Test ");

        firstNumber = 5;
        secondNumber = 7;
        thirdNumber = 3;
        expectedResult = 7;
        actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        this.check(expectedResult, actualResult, "max Of Three Numbers Test ");

        firstNumber = 5;
        secondNumber = 7;
        thirdNumber = 8;
        expectedResult = 8;
        actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        this.check(expectedResult, actualResult, "max Of Three Numbers Test ");

        firstNumber = 7;
        secondNumber = 7;
        thirdNumber = 8;
        expectedResult = 8;
        actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        this.check(expectedResult, actualResult, "max Of Three Numbers Test ");

        firstNumber = 7;
        secondNumber = 8;
        thirdNumber = 7;
        expectedResult = 8;
        actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        this.check(expectedResult, actualResult, "max Of Three Numbers Test ");

        firstNumber = 8;
        secondNumber = 7;
        thirdNumber = 7;
        expectedResult = 8;
        actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        this.check(expectedResult, actualResult, "max Of Three Numbers Test ");

        firstNumber = 7;
        secondNumber = 7;
        thirdNumber = 7;
        expectedResult = 7;
        actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        this.check(expectedResult, actualResult, "max Of Three Numbers Test ");

    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    //task 24 refactoring
    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }

}
