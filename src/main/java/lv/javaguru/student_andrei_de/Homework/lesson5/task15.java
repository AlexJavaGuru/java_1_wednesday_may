package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class task15 {
    public static void main(String[] args) {
        int[] userInput = new int[3];

        Random random = new Random();
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(userInput));
        for (int i = 0; i < userInput.length; i++) {
            userInput[i]+=2;
        }
        System.out.println(Arrays.toString(userInput));
    }

}





