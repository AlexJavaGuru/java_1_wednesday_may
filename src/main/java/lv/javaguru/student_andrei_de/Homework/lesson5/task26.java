package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = in.nextInt();
        int[] arrays = new int[n];
        Random random = new Random();
        for (int i=0;i<arrays.length;i++)
            arrays[i] = random.nextInt(10);
        System.out.print(Arrays.toString(arrays));
    }
}

