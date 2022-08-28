package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

class ShapeUtilTest {

    public static void main(String[] args) {
        calculateArea();
        calculatePerimeter();
    }

    static void calculateArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        Shape circle = new Circle("Circle", 5);
        Shape triangle = new Triangle("Triangle", 3, 2);
        Shape rectangle = new Rectangle("Rectangle", 2, 3);
        Shape square = new Square("Square", 4);
        shapes[0] = circle;
        shapes[1] = triangle;
        shapes[2] = rectangle;
        shapes[3] = square;
        double result = shapeUtil.calculateArea(shapes);
        check(result == 103.5, "Calculate Area");
    }

    static void calculatePerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        Shape circle = new Circle("Circle", 5);
        Shape triangle = new Triangle("Triangle", 3, 2);
        Shape rectangle = new Rectangle("Rectangle", 2, 3);
        Shape square = new Square("Square", 4);
        shapes[0] = circle;
        shapes[1] = triangle;
        shapes[2] = rectangle;
        shapes[3] = square;
        double result = shapeUtil.calculatePerimeter(shapes);
        check(result == 64.4, "Calculate Perimeters");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }

}
