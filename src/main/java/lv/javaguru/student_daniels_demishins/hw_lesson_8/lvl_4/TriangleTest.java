package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

public class TriangleTest {
    public static void main(String[] args) {
        testArea();
        testPerimeter();
    }

    public static void testArea() {
        Triangle triangle = new Triangle("Triangle", 5, 5);
        double expectedResult = 5.0 * 5.0 / 2;
        double result = triangle.calculateArea();
        check(result == expectedResult, "Test Triangle Area");
    }

    public static void testPerimeter() {
        Triangle triangle = new Triangle("Triangle", 5, 5);
        double expectedResult = 5 * 3;
        double result = triangle.calculatePerimeter();
        check(result == expectedResult, "Test Triangle Perimeter");
    }

    public static void check(boolean actualResult, String name) {
        if (actualResult) {
            System.out.println(name + " successed");
        } else {
            System.out.println(name + " failed");
        }
    }
}
