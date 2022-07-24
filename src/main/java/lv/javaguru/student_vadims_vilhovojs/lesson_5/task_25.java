package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Scanner;

class task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        numbers[0] = 9;
        numbers[1] = 2;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);

        }


    }

}
