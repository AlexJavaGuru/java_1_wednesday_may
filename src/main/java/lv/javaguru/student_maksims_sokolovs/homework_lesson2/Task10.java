package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: 7,5");

        double r = scanner.nextDouble();

        double p = 2 * Math.PI * r;
        System.out.println("Perimeter is = " + p);

        double area = Math.PI * r * r;
        System.out.println("Area is = " + area);

    }

}