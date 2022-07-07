package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class Circle {
    double radius;
    double pi;
    double dva;

    Circle(double radius, double pi, double dva) {
        this.radius = radius;
        this.pi = pi;
        this.dva = dva;
    }

    public double calculateArea() {
        double result = radius * pi * dva;
        return result;
    }
}

