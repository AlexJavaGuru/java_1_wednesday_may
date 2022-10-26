package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}