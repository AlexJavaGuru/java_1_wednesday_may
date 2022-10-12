package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class TriangleTest {

    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static Triangle triangle = new Triangle("Square", 3);

    static void calculateAreaTest() {
        double realResult = triangle.calculateArea();
        double expectedResult = (Math.sqrt(3)/4) * (3 * 3);
        check(realResult == expectedResult, "Calculate Area Test");
    }

    static void calculatePerimeterTest() {
        double realResult = triangle.calculatePerimeter();
        double expectedResult = 3 * 3;
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
