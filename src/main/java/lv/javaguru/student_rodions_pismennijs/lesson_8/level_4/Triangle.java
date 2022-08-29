package lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

class Triangle extends Shape {

    private double side;
    private double height;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
        this.height = (side * Math.sqrt(3)) / 2;
    }

    @Override
    double calculateArea() {
        return (side * height) / 2;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
