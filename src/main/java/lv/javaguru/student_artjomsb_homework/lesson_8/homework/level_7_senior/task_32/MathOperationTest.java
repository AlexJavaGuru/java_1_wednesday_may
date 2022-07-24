package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_32;

class MathOperationTest {
    public static void main(String[] args) {
        testAddition();
        testDivide();
        testMultiply();
        testSubtraction();
        testCombinedOperation();
    }

    static void testCombinedOperation() {
        MathOperation minus = new Subtraction(new Argument(13), new Argument(18));
        MathOperation divide = new Divide(new Argument(20), new Argument(-5));
        MathOperation multiply = new Multiply(minus, divide);
        double result = multiply.calculate();
        double expectedResult = 20;
        check(expectedResult == result, "Test combined Operation");
    }

    static void testAddition() {
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        double result = addition.calculate();
        double expectedResult = 30;
        check(result == expectedResult, "Test check addition operation");
    }

    static void testSubtraction() {
        Argument arg1 = new Argument(50);
        Argument arg2 = new Argument(20);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double result = subtraction.calculate();
        double expectedResult = 30;
        check(result == expectedResult, "Test check subtraction operation");
    }

    static void testMultiply() {
        Argument arg1 = new Argument(5);
        Argument arg2 = new Argument(4);
        MathOperation multiply = new Multiply(arg1, arg2);
        double result = multiply.calculate();
        double expectedResult = 20;
        check(result == expectedResult, "Test check multiply operation");
    }

    static void testDivide() {
        Argument arg1 = new Argument(20);
        Argument arg2 = new Argument(8);
        MathOperation divide = new Divide(arg1, arg2);
        double result = divide.calculate();
        double expectedResult = 2.5;
        check(result == expectedResult, "Test check divide operation");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
