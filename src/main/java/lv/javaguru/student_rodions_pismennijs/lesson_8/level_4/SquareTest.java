package lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

class SquareTest {

    public static void main(String[] args) {
        squareAreaTest();
        squarePerimeterTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static Square square = new Square("Square", 15.2);

    static void squareAreaTest() {
        double result = square.calculateArea();
        double expResult = 15.2 * 15.2;
        check(result == expResult, "Square Area Test");
    }

    static void squarePerimeterTest() {
        double result = square.calculatePerimeter();
        double expResult = 4 * 15.2;
        check(result == expResult, "Square Perimeter Test");
    }
}
