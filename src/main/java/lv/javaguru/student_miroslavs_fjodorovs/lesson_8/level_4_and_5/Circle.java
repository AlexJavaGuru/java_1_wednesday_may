package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

class Circle extends Shape {

    private double radius;

    Circle(String shape, double radius) {
        super(shape);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
