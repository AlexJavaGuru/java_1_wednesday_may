package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Random;

class task_13 {
    public static void main(String[] args) {
        int[] integers = new int[3];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(100);


        }
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum = sum + integers[i];

        }
        System.out.println("Sum = " + sum);


    }
}
