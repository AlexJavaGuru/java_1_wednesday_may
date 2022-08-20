package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

public class ShapeTest {

    public static void main(String[] args) {
        testCalculateAreaForCircle();
        testCalculatePerimeterForCircle();
        testCalculateAreaForSquare();
        testCalculatePerimeterForSquare();
        testCalculateAreaForRectangle();
        testCalculatePerimeterForRectangle();
        testCalculateAreaForTriangle();
        testCalculatePerimeterForTriangle();
    }

    private static void testCalculateAreaForTriangle() {
        Shape shape = new Triangle("Triangle", 3, 4, 5);
        check(shape.calculateArea() == 6, "testCalculateAreaForTriangle");
    }

    private static void testCalculatePerimeterForTriangle() {
        Shape shape = new Triangle("Triangle", 3, 4, 5);
        check(shape.calculatePerimeter() == 12, "testCalculatePerimeterForTriangle");
    }

    private static void testCalculateAreaForRectangle() {
        Shape shape = new Rectangle("Rectangle", 2, 3);
        check(shape.calculateArea() == 6, "testCalculateAreaForRectangle");
    }

    private static void testCalculatePerimeterForRectangle() {
        Shape shape = new Rectangle("Rectangle", 2, 3);
        check(shape.calculatePerimeter() == 10, "testCalculatePerimeterForRectangle");
    }

    private static void testCalculateAreaForSquare() {
        Shape shape = new Square("Square", 2.0);
        check(shape.calculateArea() == 4, "testCalculateAreaForSquare");
    }

    private static void testCalculatePerimeterForSquare() {
        Shape shape = new Square("Square", 2.0);
        check(shape.calculatePerimeter() == 8, "testCalculatePerimeterForSquare");
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
