package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        System.out.println("Enter arrays length: ");

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.println("Enter any numbers");

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
