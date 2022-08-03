package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class TriangleTest {
    public static void main(String[] args) {
        testPerimeter();
        testArea();
    }

    static void testPerimeter() {
        Triangle triangle = new Triangle("Triangle", 10);
        double result = triangle.calculatePerimeter();
        double expectedResult = 10 * 3;
        check(result == expectedResult, "Test find perimeter");
    }

    static void testArea() {
        Triangle triangle = new Triangle("Triangle", 10);
        double result = triangle.calculateArea();
        double expectedResult = (10 * (10 * Math.sqrt(3) / 2)) / 2;
        check(result == expectedResult, "Test find area");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}