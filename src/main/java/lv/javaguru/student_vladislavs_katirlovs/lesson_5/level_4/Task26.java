package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Input array length...");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Your array is " + array.length + " long");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(array));
    }
}
