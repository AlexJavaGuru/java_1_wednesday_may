package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

class Triangle extends Shape {
    private double side;

    private double high;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
        high = side * Math.sqrt(3) / 2;
    }

    @Override
    double calculateArea() {
        return side * high / 2;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }
}
