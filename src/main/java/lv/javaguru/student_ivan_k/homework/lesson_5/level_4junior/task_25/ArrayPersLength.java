package lv.javaguru.student_ivan_k.homework.lesson_5.level_4junior.task_25;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPersLength {

    public static void main(String[] args) {
        System.out.println("Please insert length array");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] userInput = new int[l];
        System.out.println("The length of array is: " + l );
        System.out.println("Please insert variable data");


        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }


        System.out.println(Arrays.toString(userInput));

    }
}
