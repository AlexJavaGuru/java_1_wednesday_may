package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        System.out.println("what radius ?");
        Scanner scanner = new Scanner (System.in);
        double radius = scanner.nextDouble();
        int degree = 2;

        System.out.println("Perimeter is = " + radius * (2 * Math.PI));
        System.out.println("Area is = " + Math.PI * + Math.pow(radius,2));

    }
}
