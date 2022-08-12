package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_32;

class MathOperationTest {

    public static void main(String[] args) {
        additionTest();
        subtractionTest();
        multiplyTest();
        divideTest();
    }

    static void additionTest() {
        MathOperation addition = new Addition(new Argument(2), new Argument(4));
        double result = addition.calculate();
        check(result == 6, "Addition test");
    }

    static void subtractionTest() {
        MathOperation subtraction = new Subtraction(new Argument(100), new Argument(5));
        double result = subtraction.calculate();
        check(result == 95, "Subtraction test");
    }

    static void multiplyTest() {
        MathOperation multiply = new Multiply(new Argument(10), new Argument(10));
        double result = multiply.calculate();
        check(result == 100, "Multiply test");
    }

    static void divideTest() {
        MathOperation divide = new Divide(new Argument(10), new Argument(2));
        double result = divide.calculate();
        check(result == 5, "Divide test");
    }
    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
