package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

class Square extends Shape {

    private int sideLength;

    Square(String title, int sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }
}
