package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_1;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number, please:");
        int number = scanner.nextInt();

        if (number < 0) System.out.println("Number " + number + " is negative.");
        else if (number > 0) System.out.println("Number " + number + " is positive.");


    }
}
