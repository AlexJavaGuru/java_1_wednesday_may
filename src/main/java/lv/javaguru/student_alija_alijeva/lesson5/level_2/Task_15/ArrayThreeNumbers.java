package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_2.Task_15;

import java.util.Arrays;
import java.util.Random;

class ArrayThreeNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        int max = 100;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(max);
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] + 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
