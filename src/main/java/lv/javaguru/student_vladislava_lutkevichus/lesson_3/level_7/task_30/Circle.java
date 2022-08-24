package lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_7.task_30;

public class Circle {
    double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double piNumber = 3.1415926;
        return piNumber * radius * radius;
    }

    void circleArea() {
        double area = calculateArea();
        System.out.println(area);
    }

}
