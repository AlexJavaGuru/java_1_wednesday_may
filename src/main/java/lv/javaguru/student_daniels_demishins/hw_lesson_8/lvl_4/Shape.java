package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
