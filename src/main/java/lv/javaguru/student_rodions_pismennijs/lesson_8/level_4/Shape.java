package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
