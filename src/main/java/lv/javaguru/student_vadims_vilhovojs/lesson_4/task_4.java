package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

import java.util.Scanner;

class task_4 {
    public static void main(String[] args) {
        System.out.println("Specify one integer");
        Scanner scanner = new Scanner(System.in);
        int variableA = scanner.nextInt();

        if ( variableA % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }






    }
}
