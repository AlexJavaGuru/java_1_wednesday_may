package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task13 {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            sum = sum + numbers[i];
    }
        System.out.println(Arrays.toString(numbers));

        System.out.println(sum);
    }
}
