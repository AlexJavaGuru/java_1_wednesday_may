package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_4.Task_28;

import java.util.Arrays;
import java.util.Random;

class MassiveFour {
    public static void main(String[] args) {
        int[] numbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(40);
        }

        System.out.println(Arrays.toString(numbers));
        int minNum = numbers[0];
        for (int j : numbers) {
            if (j < minNum)
                minNum = j;
        }
        System.out.println("Min number is " + minNum);
    }
}
