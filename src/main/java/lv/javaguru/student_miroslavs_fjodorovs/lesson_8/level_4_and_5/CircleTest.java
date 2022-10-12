package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class CircleTest {

    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static Circle circle = new Circle("Circle", 3);

    static void calculateAreaTest() {
        double realResult = circle.calculateArea();
        double expectedResult = Math.PI * (3 * 3);
        check(realResult == expectedResult, "Calculate Area Test");
    }

    static void calculatePerimeterTest() {
        double realResult = circle.calculatePerimeter();
        double expectedResult = 2 * Math.PI * 3;
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
