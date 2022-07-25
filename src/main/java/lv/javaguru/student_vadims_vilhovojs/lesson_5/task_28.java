package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Random;

class task_28 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
    }

}
