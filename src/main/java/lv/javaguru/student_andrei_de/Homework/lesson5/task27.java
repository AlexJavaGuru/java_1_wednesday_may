package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Random;

public class task27 {
    public static void main(String[] args) {
        int n;
        int[] array1;
        Random random = new Random();
        n = random.nextInt(30);
        array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array1));
        int MaxNumber = 0;
        for (int i = 0; i < array1.length; i++) {
            if (MaxNumber < array1[i]) {
                MaxNumber = array1[i];
            }
        }
        System.out.println("MaxNumber is:" + MaxNumber);
    }
}
