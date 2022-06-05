package main.java.lv.javaguru.student_maksims_sokolovs;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type radius...");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is " + perimeter);
        double area = Math.PI * radius * radius;
        System.out.println("Area is " + area);






    }

}