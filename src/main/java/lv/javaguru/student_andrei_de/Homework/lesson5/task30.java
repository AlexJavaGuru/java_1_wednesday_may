package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class task30 {
    public static void main(String[] args) {
        int n;
        int [] array4;
        Random random = new Random();
        n = random.nextInt(10);
        array4 = new int[n];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array4));

        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 != 0) {
                System.out.println(array4[i]);
            }
        }
    }
}
