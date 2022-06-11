package main.java.lv.javaguru.student_artjomsb_homework.homework3.senior;

class Circle {
    private double r;
    Circle(double r){
        this.r = r;
    }
    double calculateArea(){
        double area = Math.pow(this.r,2) *  Math.PI;
        return area;
    }
}
