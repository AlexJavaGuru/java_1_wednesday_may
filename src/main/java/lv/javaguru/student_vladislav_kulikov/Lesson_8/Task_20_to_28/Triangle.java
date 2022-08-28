package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

class Triangle extends Shape {
    double length;
    double height;
    Triangle(String title, double length, double height) {
        super(title);
        this.length = length;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return length * height * 0.5;
    }

    @Override
    double calculatePerimeter() {
        return length * 3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
}
