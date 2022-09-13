package lv.javaguru.student_artjomsb_homework.homework5.level_4_junior;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length - ");
        int arrayLength = input.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
        }
        System.out.println("Array: " + Arrays.toString(numbers));
    }
}
