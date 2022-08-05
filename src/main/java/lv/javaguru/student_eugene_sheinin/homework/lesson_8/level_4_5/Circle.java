package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

class Circle extends Shape{

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * (radius*radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
