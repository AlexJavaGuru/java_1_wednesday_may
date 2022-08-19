package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

class ShapeUtilTest {

    public static void main(String[] args) {
        calculateShapesAreaTest();
        calculateShapesPerimeterTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static ShapeUtil shapeUtil = new ShapeUtil();

    static void calculateShapesAreaTest() {
        Shape[] shapes = new Shape[4];
        Circle circle = new Circle("Circle", 10);
        Square square = new Square("Square", 10);
        Rectangle rectangle = new Rectangle("Rectangle", 12, 8);
        Triangle triangle = new Triangle("Triangle", 15);
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;
        shapes[3] = triangle;
        double result = shapeUtil.calculateArea(shapes);
        double expResult = circle.calculateArea() + square.calculateArea() + rectangle.calculateArea() + triangle.calculateArea();
        check(result == expResult, "Calculate Shapes Area Test");
    }

    static void calculateShapesPerimeterTest() {
        Shape[] shapes = new Shape[4];
        Circle circle = new Circle("Circle", 10);
        Square square = new Square("Square", 10);
        Rectangle rectangle = new Rectangle("Rectangle", 12, 8);
        Triangle triangle = new Triangle("Triangle", 15);
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;
        shapes[3] = triangle;
        double result = shapeUtil.calculatePerimeter(shapes);
        double expResult = circle.calculatePerimeter() + square.calculatePerimeter() + rectangle.calculatePerimeter() + triangle.calculatePerimeter();
        check(result == expResult, "Calculate Shapes Perimeter Test");
    }
}
