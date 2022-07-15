package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_5.Task_14;

import java.util.Arrays;
import java.util.Random;

class Array {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            sum = sum + numbers[i];
            System.out.println(Arrays.toString(numbers));
        }

        sum = sum / numbers.length;
        System.out.println(sum);
    }

}
