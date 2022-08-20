package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

class Rectangle extends Shape{

    private double length;
    private double width;

    Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return this.length * this.width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}
