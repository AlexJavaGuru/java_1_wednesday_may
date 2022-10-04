package lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

class CircleTest {

    public static void main(String[] args) {
        circleAreaTest();
        circlePerimeterTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static Circle circle = new Circle("Circle", 12.5);

    static void circleAreaTest() {
        double result = circle.calculateArea();
        double expResult = Math.PI * (12.5 * 12.5);
        check(result == expResult, "Circle Area Test");
    }

    static void circlePerimeterTest() {
        double result = circle.calculatePerimeter();
        double expResult = 2 * Math.PI * 12.5;
        check(result == expResult, "Circle Perimeter Test");
    }
}
