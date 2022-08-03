package main.java.lv.javaguru.student_vadim_zamjatin.lesson_4;

import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        double a = sc.nextDouble();
        System.out.println("Input second number: ");
        double b = sc.nextDouble();
        System.out.println("Input third number: ");
        double c = sc.nextDouble();

        if (a < b && b < c) {
            System.out.println("Increasing order");
        }else if (a > b && b > c) {
                System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
