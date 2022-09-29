package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

public class SquareTest {
    public static void main(String[] args) {
        testArea();
        testPerimeter();
    }

    public static void testArea() {
        Square square = new Square("Square", 5);
        double expectedResult = 5 * 5;
        double result = square.calculateArea();
        check(result == expectedResult, "Test Square Area");

    }


    public static void testPerimeter() {
        Square square = new Square("Square", 5);
        double expectedResult = 5 * 4;
        double result = square.calculatePerimeter();
        check(result == expectedResult, "Test Square Perimeter");
    }


    public static void check(boolean actualResult, String name) {
        if (actualResult) {
            System.out.println(name + " successed");
        } else {
            System.out.println(name + " failed");
        }
    }
}
