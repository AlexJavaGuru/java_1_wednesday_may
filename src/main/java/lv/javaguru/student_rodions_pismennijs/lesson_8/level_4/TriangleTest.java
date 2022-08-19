package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

class TriangleTest {

    public static void main(String[] args) {
        triangleAreaTest();
        trianglePerimeterTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static Triangle triangle = new Triangle("Triangle", 15);

    static void triangleAreaTest() {
        double result = triangle.calculateArea();
        double expResult = (15 * ((15 * Math.sqrt(3)) / 2)) / 2;
        check(result == expResult, "Triangle Area Test");
    }

    static void trianglePerimeterTest() {
        check(triangle.calculatePerimeter() == 45, "Triangle Perimeter Test");
    }
}
