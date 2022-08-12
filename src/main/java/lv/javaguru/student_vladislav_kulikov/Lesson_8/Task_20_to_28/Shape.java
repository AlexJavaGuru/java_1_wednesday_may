package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

abstract class Shape {

    String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
