package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

class Circle extends Shape{

    double radius;
        Circle(String title, double radius) {
            super(title);
            this.radius = radius;
    }

    double calculateArea() {
        return radius * radius * 3.14;
    }

    double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "title='" + title + '\'' +
                ", radius=" + radius +
                '}';
    }
}
