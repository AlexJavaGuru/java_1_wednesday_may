package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
