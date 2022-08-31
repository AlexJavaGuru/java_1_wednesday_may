package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

public class RectangleTest {
    public static void main(String[] args) {
        testArea();
        testPerimeter();
    }

    public static void testArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 5);
        double result = rectangle.calculateArea();
        double expectedResult = 5 * 5;
        check(result == expectedResult, "Test Rectangle Area");

    }

    public static void testPerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 5, 5);
        double expectedResult = 2 * (5 + 5);
        double result = rectangle.calculatePerimeter();
        check(result == expectedResult, "Test Rectangle Perimeter");

    }

    public static void check(boolean actualResult, String name) {
        if (actualResult) {
            System.out.println(name + " successed");
        } else {
            System.out.println(name + " failed");
        }
    }
}