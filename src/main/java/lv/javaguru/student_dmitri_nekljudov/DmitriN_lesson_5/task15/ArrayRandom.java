package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_5.task15;

import java.util.Random;

class ArrayRandom {

    public static void main(String[] args) {

        int[] userInput = new int[3];

        Random random = new Random();

        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = random.nextInt(51);
        }

        System.out.println(userInput[0]);
        System.out.println(userInput[1]);
        System.out.println(userInput[2]);

        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = userInput[i] + 2;
        }

        System.out.println(userInput[0]);
        System.out.println(userInput[1]);
        System.out.println(userInput[2]);
    }

}

