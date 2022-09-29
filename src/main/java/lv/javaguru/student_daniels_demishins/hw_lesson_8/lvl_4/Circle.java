package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

public class Circle extends Shape {

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * 3.1415 * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.1415 * radius;
    }
}
