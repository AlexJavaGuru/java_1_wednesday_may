package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_2;

import java.util.Random;

public class Arrays14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        int sum = (numbers[0] + numbers[1] + numbers[2] / 3);
        System.out.println("Average number = " + sum);
    }
}
