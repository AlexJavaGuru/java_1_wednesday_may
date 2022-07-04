package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_3junior.task_8;

import java.util.Scanner;

public class allNumDiff {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any thee numbers: ");

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();


        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All numbers are equal!");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different!");

        } else {
            System.out.println("Neither all are equal or different!");
        }
    }
}

