package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

class RectangleTest {

    public static void main(String[] args) {
        rectangleAreaTest();
        rectanglePerimeterTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static Rectangle rectangle = new Rectangle("Rectangle", 12, 8);

    static void rectangleAreaTest() {
        check(rectangle.calculateArea() == 96, "Rectangle Area Test");
    }

    static void rectanglePerimeterTest() {
        check(rectangle.calculatePerimeter() == 40, "Rectangle Perimeter Test");
    }
}
