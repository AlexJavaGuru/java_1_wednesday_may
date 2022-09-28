package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;

class Task29 {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("This number is even: " + numbers[i]);
            }
        }
    }
}
