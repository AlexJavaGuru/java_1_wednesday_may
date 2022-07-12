package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task29 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[5];
        System.out.println("Even numbers in array are: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("");
        System.out.println(Arrays.toString(array));
    }
}
