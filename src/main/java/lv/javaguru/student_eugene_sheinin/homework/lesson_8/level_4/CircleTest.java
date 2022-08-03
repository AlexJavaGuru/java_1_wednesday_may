package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4;

public class CircleTest {

    public static void main(String[] args) {
        testCalculateAreaForCircle();
        testCalculatePerimeterForCircle();
        testCalculateAreaForSquare();
        testCalculatePerimeterForSquare();
    }

    private static void testCalculateAreaForSquare() {
        Shape shape = new Square("Square", 2.0);
        check(shape.calculateArea() == (2.0 * 2.0), "testCalculateAreaForSquare");
    }

    private static void testCalculatePerimeterForSquare() {
        Shape shape = new Square("Square", 2.0);
        check(shape.calculatePerimeter() == (4 * 2.0), "testCalculatePerimeterForSquare");
    }

    private static void testCalculateAreaForCircle() {
        Shape shape = new Circle("Circle", 2.0);
        check(shape.calculateArea() == (2 * Math.PI * 4.0), "testCalculateAreaForCircle");
    }

    private static void testCalculatePerimeterForCircle() {
        Shape shape = new Circle("Circle", 2.0);
        check(shape.calculatePerimeter() == (2 * Math.PI * 2.0), "testCalculatePerimeterForCircle");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
