package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_4;

import java.util.Arrays;
import java.util.Random;

public class Array28 {
    public static void main(String[] args) {

        int[] numbers = new int[10];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        int minimumNum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minimumNum) {
                minimumNum = numbers[i];
            }
        }

        System.out.println("Minimum number is " + minimumNum);
    }
}
