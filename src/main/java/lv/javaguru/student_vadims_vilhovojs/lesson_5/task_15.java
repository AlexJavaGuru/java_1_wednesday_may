package lv.javaguru.student_vadims_vilhovojs.lesson_5;

import java.util.Arrays;
import java.util.Random;

class task_15 {
    public static void main(String[] args) {
        int[] integers = new int[3];
        Random random = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(100);
            System.out.println("[" + i + "]: " + integers[i]);
        }
        for (int i = 0; i < integers.length; i++) {
            integers[i] = integers[i] + 2;
            System.out.println("[" + i + "]: " + integers[i]);

        }


    }
}
