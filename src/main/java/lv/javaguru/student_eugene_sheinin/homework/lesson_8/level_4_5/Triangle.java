package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String title, double sideA, double sideB, double sideC) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double halfPerimeter = this.calculatePerimeter()/2;
        return Math.sqrt(
                halfPerimeter *
                        (halfPerimeter - this.sideA) *
                        (halfPerimeter - this.sideB) *
                        (halfPerimeter - this.sideC)
        );
    }

    @Override
    double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
