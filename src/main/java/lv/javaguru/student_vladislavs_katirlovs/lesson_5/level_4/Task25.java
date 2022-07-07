package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input array length...");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Your array is " + array.length + " long");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Type " + (i + 1) + " variable");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

    }
}
