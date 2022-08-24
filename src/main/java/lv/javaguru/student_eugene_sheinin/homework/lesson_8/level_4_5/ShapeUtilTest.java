package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

public class ShapeUtilTest {

    public static void main(String[] args) {
        testCalculateAreaOfShapes();
        calculatePerimeterOfShapes();
    }

    private static void testCalculateAreaOfShapes(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        check(shapes[0].calculateArea() +
                shapes[1].calculateArea() +
                shapes[2].calculateArea() +
                shapes[3].calculateArea() == shapeUtil.calculateArea(shapes),
                "testCalculateAreaOfShapes"
        );
    }
    private static void calculatePerimeterOfShapes() {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        check(shapes[0].calculatePerimeter() +
                        shapes[1].calculatePerimeter() +
                        shapes[2].calculatePerimeter() +
                        shapes[3].calculatePerimeter() == shapeUtil.calculatePerimeter(shapes),
                "calculatePerimeterOfShapes"
        );
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
