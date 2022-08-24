package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

class Square extends Shape {
    double length;

    Square(String title, double length) {
        super(title);
        this.length = length;
    }

    @Override
    double calculateArea() {
        return length * length;
    }

    @Override
    double calculatePerimeter() {
        return length * 4;
    }
}
