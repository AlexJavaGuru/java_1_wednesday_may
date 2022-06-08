package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Mean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        double mean = (double) sum / 3;

        System.out.println(" Mean number : " + mean);
    }
}
