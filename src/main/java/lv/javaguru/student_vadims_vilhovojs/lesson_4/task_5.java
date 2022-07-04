package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

import java.util.Scanner;

class task_5 {
    public static void main(String[] args) {
        System.out.println("Specify two integers");
        Scanner scanner = new Scanner(System.in);
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();

        if (variableA > variableB) {
            System.out.println(variableA);
        } else if (variableB > variableA) {
            System.out.println(variableB);
        }

    }
}
