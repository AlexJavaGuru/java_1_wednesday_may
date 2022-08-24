package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape triangle = shapeUtil.createRandomTriangle();
        double squareArea = shapeUtil.calculateArea(triangle);
        double squarePerimeter = shapeUtil.calculatePerimeter(triangle);

        System.out.println(squareArea);
        System.out.println(squarePerimeter);

    }
}
