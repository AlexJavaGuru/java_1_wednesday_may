package main.java.lv.javaguru.student_rodions_pismennijs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class ArrayTask13 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println(sum);
    }
}
