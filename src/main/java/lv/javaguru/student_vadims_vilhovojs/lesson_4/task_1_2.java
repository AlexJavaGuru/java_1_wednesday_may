package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

import java.util.Scanner;

class task_1_2 {
    public static void main(String[] args) {
        System.out.println("Specify one integer");
        Scanner scanner = new Scanner(System.in);
        int variableA = scanner.nextInt();
        if (variableA > 0 ) {
            System.out.println("Number is positive");
        } else if (variableA < 0 ) {
            System.out.println("Number is negative");
        } else if (variableA == 0 ) {
            System.out.println("Number is zero");
        }

    }

}
