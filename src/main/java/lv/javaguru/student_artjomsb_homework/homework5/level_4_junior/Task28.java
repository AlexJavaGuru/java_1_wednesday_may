package main.java.lv.javaguru.student_artjomsb_homework.homework5.level_4_junior;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter array length - ");
        int arrayLength = input.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200) - 100;
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
        }
        System.out.println("Smallest number: " + minNumber);
    }
}