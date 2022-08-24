package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

class Rectangle extends Shape {

    public int verticalSideLength;
    public int horizontalSideLength;

    Rectangle(String title, int verticalSideLength, int horizontalSideLength) {
        super(title);
        this.verticalSideLength = verticalSideLength;
        this.horizontalSideLength = horizontalSideLength;
    }

    @Override
    double calculateArea() {
        return verticalSideLength * horizontalSideLength;
    }

    @Override
    double calculatePerimeter() {
        return (verticalSideLength * 2) + (horizontalSideLength * 2);
    }
}
