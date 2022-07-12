package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter array length, please - ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the number, please " + (i + 1) + ": ");
            numbers[i] = random.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (maxNum < numbers[i]) {
                maxNum = numbers[i];
            }
        }
        System.out.println("Highest humber: " + maxNum);
    }
}

