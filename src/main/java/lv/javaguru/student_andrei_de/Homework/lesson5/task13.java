package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        int[] userInput = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < userInput.length; i++) {
          sum = sum + userInput[i];
            System.out.println("Sum = " + sum);
        }

        Random random = new Random();
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = random.nextInt(3);
        }
        System.out.println(Arrays.toString(userInput));
    }
}

