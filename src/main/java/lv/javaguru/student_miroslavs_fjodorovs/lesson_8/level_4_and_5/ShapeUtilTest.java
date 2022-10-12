package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class ShapeUtilTest {

    public static void main(String[] args) {
        calculateAreaTest();
        calculatePerimeterTest();
    }

    static void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculateArea(shapes);
        double expectedResult = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea();
        check(realResult == expectedResult, "Calculate Total Area of Shapes Test");
    }

    static void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double realResult = shapeUtil.calculatePerimeter(shapes);
        double expectedResult = shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() + shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter();
        check(realResult == expectedResult, "Calculate Total Perimeter of Shapes Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
