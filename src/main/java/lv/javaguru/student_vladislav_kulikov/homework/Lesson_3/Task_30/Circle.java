package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_3.Task_30;

 class Circle {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    void calculateArea() {
        System.out.println("Radius = " + radius * radius * 3.14);
    }
}
