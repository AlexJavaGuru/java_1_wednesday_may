package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        int [] a;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array:");
        n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "] =" );
            a[i]= in.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
