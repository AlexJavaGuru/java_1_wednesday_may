package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_3junior.task_10;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any thee numbers: ");

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();


        if (num1 > num2 && num1 > num3){
            System.out.println("Number 1 (" + num1 + ") in largest!");
        } else if (num2 > num1 && num2 > num3){
            System.out.println("Number 2 (" + num2 + ") is largest!");
        } else {
            System.out.println("Number 3 (" + num3 + ") is largest!");
        }

    }
}
