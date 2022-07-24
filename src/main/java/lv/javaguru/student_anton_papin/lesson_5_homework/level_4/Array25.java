package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_4;

import java.util.Arrays;
import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length, please - ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number, please " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
        }
        System.out.println("Array: " + Arrays.toString(numbers));
    }
}

