package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3.task_30;

class Circle {
    String name;
    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println("circle radius = " + radius);
        System.out.println("double calculateArea = " + Math.PI * + Math.pow(radius,2));
    }
}
