package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3.task_30;

class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        double area = Math.pow(radius, 2) * Math.PI;
        return area;

    }


}
