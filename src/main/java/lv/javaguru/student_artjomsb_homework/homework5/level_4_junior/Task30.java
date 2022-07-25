package main.java.lv.javaguru.student_artjomsb_homework.homework5.level_4_junior;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task30 {
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

        System.out.print("Odd numbers : ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        int[] oddNumbers = new int[0];
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers = Arrays.copyOf(oddNumbers, oddNumbers.length + 1);
                oddNumbers[oddNumbers.length - 1] = number;
            }
        }
        if (oddNumbers.length == 0) System.out.println("No Odd numbers");
        else System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
    }
}
