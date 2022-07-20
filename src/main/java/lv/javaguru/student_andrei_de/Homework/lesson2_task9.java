package main.java.lv.javaguru.student_andrei_de.Homework;

import java.util.Scanner;

public class lesson2_task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the Number: ");
        int n = in .nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + " =" + (n * i));
        }
    }
}
