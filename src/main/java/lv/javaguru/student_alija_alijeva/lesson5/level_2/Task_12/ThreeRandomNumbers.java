package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_2.Task_12;

import main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_5.Task_26.Array;

import java.util.Arrays;
import java.util.Random;

class ThreeRandomNumbers {
    public static void main(String[] args) {
        int[] randomNumbers = new int[3];
        Random random = new Random();
        int max = 1000;
        randomNumbers[0] = random.nextInt(max);
        randomNumbers[1] = random.nextInt(max);
        randomNumbers[2] = random.nextInt(max);

        System.out.println(Arrays.toString(randomNumbers));
    }
}
