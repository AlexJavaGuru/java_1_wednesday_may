package lv.javaguru.student_rodions_pismennijs.lesson_8.level_7.math;

public class MathOperationTest {

    public static void main(String[] args) {
        additionTest();
        subtractionTest();
        multiplyTest();
        divideTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static void additionTest() {
        MathOperation addition = new Addition(new Argument(20), new Argument(10));
        check(addition.calculate() == 30, "Addition Test");
    }

    static void subtractionTest() {
        MathOperation subtraction = new Subtraction(new Argument(20), new Argument(10));
        check(subtraction.calculate() == 10, "Subtraction Test");
    }

    static void multiplyTest() {
        MathOperation multiply = new Multiply(new Argument(20), new Argument(10));
        check(multiply.calculate() == 200, "Multiply Test");
    }

    static void divideTest() {
        MathOperation divide = new Divide(new Argument(20), new Argument(10));
        check(divide.calculate() == 2, "Divide Test");
    }
}
