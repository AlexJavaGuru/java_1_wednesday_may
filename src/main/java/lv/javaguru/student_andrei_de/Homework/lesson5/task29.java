package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class task29 {
    public static void main(String[] args) {
        int n;
        int[] array3;
        Random random = new Random();
        n = random.nextInt(20);
        array3 = new int[n];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = random.nextInt(25);
        }
        System.out.println(Arrays.toString(array3));

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 2 == 0) {
                System.out.println(array3[i]);
            }
        }
    }
}