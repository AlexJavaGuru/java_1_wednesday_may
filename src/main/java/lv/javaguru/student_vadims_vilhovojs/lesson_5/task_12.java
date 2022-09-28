package lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Random;

class task_12 {
    public static void main(String[] args) {
        int[] integers = new int[3];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i] = random.nextInt(100));

        }
        for (int i = 0; i < integers.length; i++) {
            System.out.println("[" + i + "] = " + integers[i]);

        }
    }
}
