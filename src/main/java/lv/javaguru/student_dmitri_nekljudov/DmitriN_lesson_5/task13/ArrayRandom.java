package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_5.task13;

import java.util.Random;

class ArrayRandom {
    public static void main(String[] args) {

        int[] userInput = new int[3];
        int sum = 0;

        Random random = new Random();

        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = random.nextInt(51);
            sum = sum + userInput[i];
        }

        System.out.println("Sum = " + sum);

    }
}