package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class RectangleTest {

    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static Rectangle rectangle = new Rectangle("Rectangle", 3, 5);

    static void calculateAreaTest() {
        double realResult = rectangle.calculateArea();
        double expectedResult = 3 * 5;
        check(realResult == expectedResult, "Calculate Area Test");
    }

    static void calculatePerimeterTest() {
        double realResult = rectangle.calculatePerimeter();
        double expectedResult = 2 * (3 + 5);
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
