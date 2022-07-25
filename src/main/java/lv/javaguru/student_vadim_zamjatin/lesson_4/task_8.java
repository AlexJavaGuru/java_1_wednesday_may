package main.java.lv.javaguru.student_vadim_zamjatin.lesson_4;


import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int a = in.nextInt();
        System.out.println("Input second number: ");
        int b = in.nextInt();
        System.out.println("Input third number: ");
        int c = in.nextInt();

        if (a == b && a == c) {
            System.out.println("All numbers are equals");
        } else if ((a == b) || (a == c) || (c == b)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
