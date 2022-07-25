package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_7;

class Circle {

    double radius;
    double area;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        area = Math.PI * radius * radius;
        return area;

    }
}
