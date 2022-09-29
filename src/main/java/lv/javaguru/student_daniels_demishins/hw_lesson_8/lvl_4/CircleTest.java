package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

public class CircleTest {
    public static void main(String[] args) {
        testArea();
        testPerimeter();

    }


    public static void testArea() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 5 * 3.1415 * 5;
        double result = circle.calculateArea();
        check(result == expectedResult, " Test Circle Area");
    }

    public static void testPerimeter() {
        Circle circle = new Circle("Circle", 5);
        double expectedResult = 2 * 3.1415 * 5;
        double result = circle.calculatePerimeter();
        check(result == expectedResult, "Test Circle Perimeter");
    }

    public static void check(boolean actualResult, String name) {
        if (actualResult) {
            System.out.println(name + " successed");
        } else {
            System.out.println(name + " failed");
        }
    }
}

