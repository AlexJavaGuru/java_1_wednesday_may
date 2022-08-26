package lv.javaguru.student_ivan_k.homework.lesson_4.level_2intern.task_7;

import java.util.Scanner;

public class equalsOrDifferents {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter two any numbers: ");

        int num1 = scr.nextInt();
        int num2 = scr.nextInt();

        if (num1 == num2){
            System.out.println("Numbers are equals!");
        } else {
            System.out.println("Numbers are different!");
        }
    }
}
