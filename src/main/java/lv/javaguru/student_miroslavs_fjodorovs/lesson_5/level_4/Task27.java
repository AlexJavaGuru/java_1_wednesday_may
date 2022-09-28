package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task27 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}

