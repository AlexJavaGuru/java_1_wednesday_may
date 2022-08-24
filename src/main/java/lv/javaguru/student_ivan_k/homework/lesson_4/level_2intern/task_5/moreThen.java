package lv.javaguru.student_ivan_k.homework.lesson_4.level_2intern.task_5;

import java.util.Scanner;

public class moreThen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter two any numbers: ");

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();

        if (num1 > num2){
            System.out.println("Your first number (" + num1 + ") is greater than the second (" + num2 + ")!");
        } else {
            System.out.println("Your second number (" + num2 + ") is greater than the first! (" +
                    + num1 + ")!");
        }
    }
}
