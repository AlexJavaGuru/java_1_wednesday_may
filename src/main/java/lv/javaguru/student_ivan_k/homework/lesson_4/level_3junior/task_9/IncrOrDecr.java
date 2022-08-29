package lv.javaguru.student_ivan_k.homework.lesson_4.level_3junior.task_9;

import java.util.Scanner;

public class IncrOrDecr {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter any thee numbers: ");

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();
        int num3 = scr.nextInt();



        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing!");

        } else {
            System.out.println("Neither increasing or decreasing order!");
        }


    }

}

