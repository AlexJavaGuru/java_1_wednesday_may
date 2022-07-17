package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task15 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        array[0] = random.nextInt(10);
        array[1] = random.nextInt(10);
        array[2] = random.nextInt(10);
        System.out.println(Arrays.toString(array));
        array[0] = array[0] + 2;
        array[1] = array[1] + 2;
        array[2] = array[2] + 2;
        System.out.println(Arrays.toString(array));
    }
}
