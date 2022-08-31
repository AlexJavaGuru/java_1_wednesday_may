package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();


}
