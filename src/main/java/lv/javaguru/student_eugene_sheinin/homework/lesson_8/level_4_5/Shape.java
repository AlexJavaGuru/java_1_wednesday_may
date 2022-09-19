package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "shape title: " + title +
                ", area: " + this.calculateArea() +
                ", perimeter: " + this.calculatePerimeter();
    }
}
