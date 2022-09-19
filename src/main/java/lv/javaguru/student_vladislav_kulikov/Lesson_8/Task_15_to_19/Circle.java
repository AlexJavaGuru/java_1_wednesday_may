package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class Circle extends Shape {

    private double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}
