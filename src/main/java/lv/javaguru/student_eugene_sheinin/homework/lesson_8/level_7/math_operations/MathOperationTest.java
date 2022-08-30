package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.math_operations;

public class MathOperationTest {

    public static void main(String[] args) {
        testDivide();
        testMultiply();
        testExpression();
        testSubtraction();
        testAddition();
    }

    private static void testAddition() {
        check(new Addition(
                new Argument(20), new Argument(5)).calculate() == 25,
                "testAddition"
        );
    }

    private static void testSubtraction() {
        check(new Subtraction(new Argument(20), new Argument(5)).calculate() == 15,
                "testSubtraction"
        );
    }

    private static void testDivide() {
        check(new Divide(new Argument(20), new Argument(5)).calculate() == 4,
                "testDivide"
        );
    }

    private static void testMultiply() {
        check(new Multiply(new Argument(20), new Argument(5)).calculate() == 100,
                "testMultiply"
        );
    }

    private static void testExpression() {
        double result = new Multiply(
                new Subtraction(new Argument(10), new Argument(5)),
                new Divide(new Argument(20), new Argument(5))
        ).calculate();

        check(result == 20, "MathOperationTest");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
