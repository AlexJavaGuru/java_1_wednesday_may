package lv.javaguru.student_artjomsb_homework.homework5.level_4_junior;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task29 {
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
        //Простой вариант
        System.out.print("Even numbers : ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
        //С запоминанием четных чисел
        int[] evenNumbers = new int[0];
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers = Arrays.copyOf(evenNumbers, evenNumbers.length + 1);
                evenNumbers[evenNumbers.length - 1] = number;
            }
        }
        if (evenNumbers.length == 0) System.out.println("No Even numbers");
        else System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
    }
}
