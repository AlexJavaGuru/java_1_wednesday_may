package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class Triangle extends Shape {

    private double sideLength;

    Triangle(String shape, double sideLength) {
        super(shape);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return (Math.sqrt(3)/4) * (sideLength * sideLength);
    }

    @Override
    double calculatePerimeter() {
        return 3 * sideLength;
    }
}
