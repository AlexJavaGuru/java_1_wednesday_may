package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class Rectangle extends Shape {

    private double sideLengthOne;
    private double sideLengthTwo;

    Rectangle(String shape, double sideLengthOne, double sideLengthTwo) {
        super(shape);
        this.sideLengthOne = sideLengthOne;
        this.sideLengthTwo = sideLengthTwo;
    }

    @Override
    double calculateArea() {
        return sideLengthOne * sideLengthTwo;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (sideLengthOne + sideLengthTwo);
    }
}
