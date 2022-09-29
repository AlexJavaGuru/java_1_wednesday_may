package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

public class ShapeUtilDemo {

    ShapeUtil shapeUtil = new ShapeUtil();

    Shape circle = shapeUtil.createRandomCircle();
    double circleArea = shapeUtil.calculateArea(circle);
    double circlePerimeter = shapeUtil.calculatePerimeter(circle);

    Shape square = shapeUtil.createRandomSquare();
    double squareArea = shapeUtil.calculateArea(square);
    double squarePerimeter = shapeUtil.calculatePerimeter(square);
}
