package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomShape();
        double shapeArea = shapeUtil.calculateArea(shape);
        double shapePerimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println("Area is " + shapeArea);
        System.out.println("Perimeter is " + shapePerimeter);
    }
}
