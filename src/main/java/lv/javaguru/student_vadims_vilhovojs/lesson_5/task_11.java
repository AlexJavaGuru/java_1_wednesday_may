package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Scanner;

class task_11 {
    public static void main(String[] args) {
        int[] integers = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i] = scanner.nextInt());
        }
        for (int i = 0; i < integers.length; i++) {
            System.out.println("[" + i + "] = " + integers[i]);

        }
    }
}
