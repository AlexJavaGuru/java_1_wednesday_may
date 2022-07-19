package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_4.Task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class UserMassiveTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
    }

}
