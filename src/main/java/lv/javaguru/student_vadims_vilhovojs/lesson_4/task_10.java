package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

import java.util.Scanner;

class task_10 {
    public static void main(String[] args) {
        System.out.println("Specify three integers");
        Scanner scanner = new Scanner(System.in);
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();
        int variableC = scanner.nextInt();

        if (variableA > variableB && variableA > variableC) {
            System.out.println(variableA);
        } else if (variableB > variableA && variableB > variableC) {
            System.out.println(variableB);
        } else if (variableC > variableA && variableC > variableB ){
            System.out.println(variableC);
        }
    }
}
