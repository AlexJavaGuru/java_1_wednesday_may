package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5, 3.14159, 2);
        double result = circle.calculateArea();
        System.out.println("Area radius is " + result);
    }
}