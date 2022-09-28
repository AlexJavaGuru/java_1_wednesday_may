package lv.javaguru.student_ivan_k.homework.lesson_5.level_4junior.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPerLegthRandNum {

    public static void main(String[] args) {
        System.out.print("Please insert length array: ");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int[] userInput = new int[l];
        System.out.println("The length of array is: " + l );
        System.out.println("Variables will be generated! ");
        Random random = new Random();
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(userInput));
    }
}
