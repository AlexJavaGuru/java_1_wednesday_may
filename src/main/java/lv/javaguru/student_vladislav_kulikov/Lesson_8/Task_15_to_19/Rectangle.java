package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class Rectangle extends Shape {

    private double numberA;
    private double numberB;

    Rectangle(double numberA, double numberB, String title) {
        super(title);
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    double calculateArea() {
        return numberA * numberB;
    }

    @Override
    double calculatePerimeter() {
        return numberA + numberB * 2;
    }
}
