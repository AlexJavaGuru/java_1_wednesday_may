package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_4.Task_30;

import java.util.Arrays;
import java.util.Random;

class MassiveSix {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(40);
        }

        System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
