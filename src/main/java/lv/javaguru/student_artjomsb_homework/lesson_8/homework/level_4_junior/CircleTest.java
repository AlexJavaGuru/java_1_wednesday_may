package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class CircleTest {
    public static void main(String[] args) {
        testPerimeter();
        testArea();
    }

    static void testPerimeter() {
        Circle circle = new Circle(10, "circle");
        double result = circle.calculatePerimeter();
        double expectedResult = 10 * 2 * Math.PI;
        check(result == expectedResult, "Test find perimeter");
    }

    static void testArea() {
        Circle circle = new Circle(10, "circle");
        double result = circle.calculateArea();
        double expectedResult = 10 * 10 * Math.PI;
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
