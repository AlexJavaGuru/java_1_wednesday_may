package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}