package lv.javaguru.student_artjomsb_homework.homework5.level_4_junior;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter array length - ");
        int arrayLength = input.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(200) - 100;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        int maxNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("Largest number: " + maxNumber);
    }
}
