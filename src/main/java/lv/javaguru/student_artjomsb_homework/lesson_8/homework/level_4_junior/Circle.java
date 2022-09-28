package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class Circle extends Shape {

    private double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * Math.PI * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}