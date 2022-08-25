package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

class Triangle extends Shape {

    public int sideLength;

    Triangle(String title, int sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return Math.sqrt(3) / 4 * sideLength * sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }

}
