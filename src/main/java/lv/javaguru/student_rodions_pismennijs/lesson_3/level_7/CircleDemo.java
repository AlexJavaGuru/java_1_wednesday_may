package lv.javaguru.student_rodions_pismennijs.lesson_3.level_7;

import java.util.Scanner;

class CircleDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type radius... ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        double calculateArea = circle.calculateArea();
        System.out.println("Area is " + calculateArea);

    }

}
