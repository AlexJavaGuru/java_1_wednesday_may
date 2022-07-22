package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

import java.util.Scanner;

class task_8 {
    public static void main(String[] args) {
        System.out.println("Specify three numbers");
        Scanner scanner = new Scanner(System.in);
        double variableA = scanner.nextDouble();
        double variableB = scanner.nextDouble();
        double variableC = scanner.nextDouble();

        if (variableA == variableB && variableC == variableA) {
            System.out.println("All numbers are equal");
        } else if (variableA != variableB && variableB != variableC && variableA != variableC) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
