package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_7;

class Circle {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return Math.PI * (radius * radius);
    }
}
