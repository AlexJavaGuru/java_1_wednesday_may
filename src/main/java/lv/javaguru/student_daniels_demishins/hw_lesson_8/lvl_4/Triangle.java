package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

public class Triangle extends Shape {
    private double side;
    private double height;

    public Triangle(String title, double height, double side) {
        super(title);
        this.height = height;
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * height / 2;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}
