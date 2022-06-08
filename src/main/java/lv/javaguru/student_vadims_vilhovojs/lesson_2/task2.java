package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        System.out.println("Specify two numbers with a comma");
        Scanner scanner = new Scanner (System.in);
        double variableA = scanner.nextDouble();
        double variableB = scanner.nextDouble();

        System.out.println(variableA + variableB);
        System.out.println(variableA - variableB);
        System.out.println(variableA * variableB);
        System.out.println(variableA / variableB);
    }
}
