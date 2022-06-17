package main.java.lv.javaguru.student_artjomsb_homework.homework3.senior;

class Circle {
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        double area = Math.pow(radius, 2) *  Math.PI;
        return area;
    }
}
