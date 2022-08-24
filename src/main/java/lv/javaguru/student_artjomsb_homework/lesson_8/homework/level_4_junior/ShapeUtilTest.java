package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class ShapeUtilTest {
    public static void main(String[] args) {
        testCalculateTotalArea();
        testCalculateTotalPerimeter();
    }

    static void testCalculateTotalPerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        double radius = 12 / Math.PI;
        shapes[0] = new Circle(radius, "circle");
        shapes[1] = new Square("square", 3.5);
        shapes[2] = new Rectangle("square", 2, 7);
        shapes[3] = new Triangle("triangle", 9.5);
        double result = shapeUtil.calculateTotalPerimeter(shapes);
        double expectedResult = 84.5;
        check(result == expectedResult, "Test find all shapes total perimeter");
    }

    static void testCalculateTotalArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        double radius = 12 / Math.sqrt(Math.PI);
        double triangleSide = 7 * Math.pow(3, 0.25);
        shapes[0] = new Circle(radius, "circle");
        shapes[1] = new Square("square", 2.5);
        shapes[2] = new Rectangle("square", 3, 6);
        shapes[3] = new Triangle("triangle", triangleSide);
        double result = shapeUtil.calculateTotalArea(shapes);
        double expectedResult = 205.0;
        check(result == expectedResult, "Test find all shapes total area");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
