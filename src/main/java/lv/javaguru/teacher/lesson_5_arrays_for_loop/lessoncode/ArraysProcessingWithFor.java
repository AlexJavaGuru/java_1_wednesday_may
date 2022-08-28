package lv.javaguru.teacher.lesson_5_arrays_for_loop.lessoncode;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysProcessingWithFor {

    public static void main(String[] args) {

        int[] userInput = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }


        int sum = 0;
        for (int i = 0; i < userInput.length; i++) {
            sum = sum + userInput[i];
        }

        System.out.println("Sum = " + sum);

        Random random = new Random();
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = random.nextInt(10) - 5;
        }


        System.out.println(Arrays.toString(userInput));
    }
}
