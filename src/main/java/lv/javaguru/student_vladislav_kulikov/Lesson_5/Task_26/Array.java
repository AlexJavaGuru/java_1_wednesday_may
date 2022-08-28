package lv.javaguru.student_vladislav_kulikov.Lesson_5.Task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        System.out.print("Enter length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();

            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
