package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_7;

class MathOperationTest {

    public static void main(String[] args) {
        additionTest();
        subtractionTest();
        divideTest();
        multiplyTest();
    }

    static void additionTest() {
        MathOperation addition = new Addition(new Argument(10), new Argument(20));
        check(addition.calculate() == 30, "Addition test");
    }

    static void subtractionTest() {
        MathOperation subtraction = new Subtraction(new Argument(50), new Argument(20));
        check(subtraction.calculate() == 30, "Subtraction test");
    }

    static void divideTest() {
        MathOperation divide = new Divide(new Argument(20), new Argument(5));
        check(divide.calculate() == 4, "Divide test");
    }

    static void multiplyTest() {
        MathOperation multiply = new Multiply(new Argument(5), new Argument(4));
        check(multiply.calculate() == 20, "Multiply test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
