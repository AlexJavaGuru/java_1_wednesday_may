package main.java.lv.javaguru.student_rodions_pismennijs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class ArrayTask27 {

    public static void main(String[] args) {

        int[] number = new int[10];

        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(50);
        }

        System.out.println(Arrays.toString(number));

        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        System.out.println(max);
    }
}