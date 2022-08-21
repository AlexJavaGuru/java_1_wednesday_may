package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

        Shape shape = shapeUtil.createRandomShape();
        double shapeArea = shapeUtil.calculateArea(shape);
        double shapePerimeter = shapeUtil.calculatePerimeter(shape);

        System.out.println(circle + " \n " +
                rectangle + " \n " +
                square + " \n " +
                triangle + " \n  randomShape" + shape);
    }

}
