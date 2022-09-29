package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String title, int length, int width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}
