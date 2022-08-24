package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

public class Square extends Shape{
    double side;
    private static final int SIDE_COUNT = 4;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return SIDE_COUNT * side;
    }
}
