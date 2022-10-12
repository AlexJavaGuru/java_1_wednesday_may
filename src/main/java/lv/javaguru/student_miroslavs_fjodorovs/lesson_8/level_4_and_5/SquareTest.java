package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class SquareTest {

    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static Square square = new Square("Square", 3);

    static void calculateAreaTest() {
        double realResult = square.calculateArea();
        double expectedResult = 3 * 3;
        check(realResult == expectedResult, "Calculate Area Test");
    }

    static void calculatePerimeterTest() {
        double realResult = square.calculatePerimeter();
        double expectedResult = 4 * 3;
        check(realResult == expectedResult, "Calculate Perimeter Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
