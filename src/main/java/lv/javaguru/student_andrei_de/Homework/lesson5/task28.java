package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class task28 {
    public static void main(String[] args) {
        int f;
        int[] array2;
        Random random = new Random();
        f = random.nextInt(60);
        array2 = new int[f];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array2));
        int MinNumber = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (MinNumber > array2[i]) {
                MinNumber = array2[i];

            }
        }
        System.out.println("MinNumber is:" + MinNumber);
    }
}
