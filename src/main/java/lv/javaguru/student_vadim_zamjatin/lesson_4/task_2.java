package lv.javaguru.student_vadim_zamjatin.lesson_4;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if( number == 0) {
            System.out.println("Number is equal to zero");
        }
        else if (number > 0) {
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }
    }
}
