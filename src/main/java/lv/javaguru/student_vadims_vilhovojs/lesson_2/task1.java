package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        System.out.println("Specify two integers");
        Scanner scanner = new Scanner(System.in);
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();

        System.out.println(variableA + variableB);
        System.out.println(variableA - variableB);
        System.out.println(variableA * variableB);
        System.out.println(variableA / (double) variableB);




    }
}
