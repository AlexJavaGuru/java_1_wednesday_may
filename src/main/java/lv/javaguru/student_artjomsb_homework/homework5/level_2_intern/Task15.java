package main.java.lv.javaguru.student_artjomsb_homework.homework5.level_2_intern;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " = " + numbers[i]);
        }
    }
}
