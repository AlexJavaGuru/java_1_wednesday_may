package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class Triangle extends Shape {

    private double numberA;
    private double numberB;
    private double numberC;
    private double height;

    Triangle(double numberA, double numberB, double numberC, double height, String title) {
        super(title);
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return numberA * height * 0.5;
    }

    @Override
    double calculatePerimeter() {
        return numberA + numberB + numberC;
    }
}
