package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_25;

import java.util.Arrays;
import java.util.Scanner;

class Array {

    public static void main(String[] args) {

        System.out.print("Enter length: ");

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        System.out.print("Enter numbers: ");

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
