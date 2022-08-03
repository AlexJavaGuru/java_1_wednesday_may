package main.java.lv.javaguru.student_vadim_zamjatin.lesson_4;

import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if( number == 0) {
        }
        else if (number > 0) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }






}
