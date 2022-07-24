package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_2;

import java.util.Arrays;
import java.util.Random;

public class Arrays15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
