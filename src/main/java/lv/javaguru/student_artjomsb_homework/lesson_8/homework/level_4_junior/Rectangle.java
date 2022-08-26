package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class Rectangle extends Shape {
    private double sideX;
    private double sideY;

    public Rectangle(String title, double sideX, double sideY) {
        super(title);
        this.sideX = sideX;
        this.sideY = sideY;
    }

    @Override
    double calculateArea() {
        return sideX * sideY;
    }

    @Override
    double calculatePerimeter() {
        return (sideX + sideY) * 2;
    }
}
