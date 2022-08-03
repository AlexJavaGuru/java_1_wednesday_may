package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Random;
import java.util.Scanner;

class task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] = random.nextInt(100));

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);

        }

    }

}