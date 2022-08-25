package lv.javaguru.student_artjomsb_homework.homework3.senior;
import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = inputRadius.nextDouble();
        Circle circleOne = new Circle(radius);
        double area = circleOne.calculateArea();
        System.out.println("Area = " + area + " cm^2");
    }
}
