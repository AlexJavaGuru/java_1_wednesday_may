package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_4.Task_27;

import java.util.Arrays;
import java.util.Random;

class MassiveThree {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
        int maxNum = numbers[0];
        for (int j : numbers) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Max number is " + maxNum);
    }
}
