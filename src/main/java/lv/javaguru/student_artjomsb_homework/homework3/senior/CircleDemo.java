package main.java.lv.javaguru.student_artjomsb_homework.homework3.senior;
import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double r = radius.nextDouble();
        Circle circleOne = new Circle(r);
        double area = circleOne.calculateArea();
        System.out.println("Area = " + area + " cm^2");
    }
}
