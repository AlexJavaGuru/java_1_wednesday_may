package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class RectangleTest {
    public static void main(String[] args) {
        testPerimeter();
        testArea();
    }

    static void testPerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 7, 4);
        double result = rectangle.calculatePerimeter();
        double expectedResult = (7 + 4) * 2;
        check(result == expectedResult, "Test find perimeter");
    }

    static void testArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 13, 9);
        double result = rectangle.calculateArea();
        double expectedResult = 13 * 9;
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
