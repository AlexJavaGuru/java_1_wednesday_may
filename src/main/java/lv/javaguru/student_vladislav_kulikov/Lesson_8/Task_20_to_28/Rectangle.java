package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

class Rectangle extends Shape{

    double lengthA;
    double lengthB;
    Rectangle(String title, double lengthA, double lengthB) {
        super(title);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }
    @Override
    double calculateArea() {
        return lengthA * lengthB;
    }

    @Override
    double calculatePerimeter() {
        return lengthA + lengthB * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "title='" + title + '\'' +
                ", lengthA=" + lengthA +
                ", lengthB=" + lengthB +
                '}';
    }
}
