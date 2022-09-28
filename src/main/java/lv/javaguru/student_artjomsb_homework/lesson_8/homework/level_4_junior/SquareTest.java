package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class SquareTest {
    public static void main(String[] args) {
        testPerimeter();
        testArea();
    }

    static void testPerimeter() {
        Square square = new Square("square", 10);
        double result = square.calculatePerimeter();
        double expectedResult = 10 * 4;
        check(result == expectedResult, "Test find perimeter");
    }

    static void testArea() {
        Square square = new Square("square", 10);
        double result = square.calculateArea();
        double expectedResult = 10 * 10;
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
