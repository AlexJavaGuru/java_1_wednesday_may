package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class Square extends Shape {

    private double sideLength;

    Square(double sideLength, String title) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }
}
