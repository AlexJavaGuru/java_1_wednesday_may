package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_3;

import java.util.Scanner;

public class ThreeNumbersDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number, please: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number, please: ");
        int second = scanner.nextInt();
        System.out.print("Enter the third number, please: ");
        int third = scanner.nextInt();

        if (first == second && second == third) {
            System.out.println("All numbers are equal");
        } else if (first != second && first != third && second != third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

