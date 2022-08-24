package lv.javaguru.student_ivan_k.homework.lesson_4.level_2intern.task_6;

import java.util.Scanner;

public class lessThen {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter two any numbers: ");

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();

        if (num1 > num2){
            System.out.println(num2);
        } else {
            System.out.println(num1);
        }
    }
}
