package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_30;

import java.lang.Math;

public class Circle {

    double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }


}
