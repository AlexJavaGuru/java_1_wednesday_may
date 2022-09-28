package lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Random;

class task_30 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]: " + numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int odd = numbers[i];
            if (numbers[i] % 2 != 0) {
                System.out.println("odd numbers = " + odd);
            }

        }
    }
}

