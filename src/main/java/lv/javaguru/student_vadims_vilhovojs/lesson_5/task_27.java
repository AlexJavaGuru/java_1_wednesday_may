package lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Random;

class task_27 {
    public static void main(String[] args) {
        int[] numbers = new int[7];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
    }
}