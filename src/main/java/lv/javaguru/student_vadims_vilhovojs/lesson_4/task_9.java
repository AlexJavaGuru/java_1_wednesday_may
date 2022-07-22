package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

import java.util.Scanner;

class task_9 {
    public static void main(String[] args) {
        System.out.println("Specify three numbers");
        Scanner scanner = new Scanner(System.in);
        double variableA = scanner.nextDouble();
        double variableB = scanner.nextDouble();
        double variableC = scanner.nextDouble();

        if (variableA > variableB && variableB > variableC) {
            System.out.println("decreasing");
        } else if (variableA < variableB && variableB < variableC) {
            System.out.println("increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }


    }
}
