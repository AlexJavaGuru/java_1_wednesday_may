package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class task14 {
    public static void main(String[] args) {
        int[] userInput = new int[3];

        Random random = new Random();
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = random.nextInt(10);
        }
        int sum = 0;
        for (int i = 0; i < userInput.length; i++) {
            sum = sum + userInput[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println(Arrays.toString(userInput));
        int average = sum/userInput.length;
        System.out.println("average = " +average);
    }

}





