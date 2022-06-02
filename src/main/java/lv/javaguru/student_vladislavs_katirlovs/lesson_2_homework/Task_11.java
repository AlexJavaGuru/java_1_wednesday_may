package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_2_homework;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type first number...");
        int first = scanner.nextInt();
        System.out.println("Type second number...");
        int second = scanner.nextInt();
        System.out.println("Type third number...");
        int third = scanner.nextInt();

        double arithm = ((double) first + second + third) / 3;
        System.out.println("An arithmetic average is " + arithm);
    }
}
