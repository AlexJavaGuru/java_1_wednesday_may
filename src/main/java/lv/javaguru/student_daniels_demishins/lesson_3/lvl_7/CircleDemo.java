package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5, 3.14159, 2);
        double calculateArea = circle.getRadius()* circle.getPi()* circle.getDva();
        System.out.println(calculateArea);
    }
}




