package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_2;

import java.util.Arrays;
import java.util.Random;

public class Arrays12 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        System.out.println(Arrays.toString(numbers));
    }
}
