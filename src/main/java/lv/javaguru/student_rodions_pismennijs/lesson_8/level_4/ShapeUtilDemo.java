package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomShape();
        double shapeArea = shapeUtil.calculateArea(shape);
        double shapePerimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println("Area - " + shapeArea + " Perimeter - " + shapePerimeter);
    }
}
