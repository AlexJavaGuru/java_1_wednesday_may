package main.java.lv.javaguru.student_rodions_pismennijs.lesson_2.level_3;

import java.util.Scanner;

public class Arithmetical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type first number : ");
        int first = scanner.nextInt();
        System.out.print("Type second number : ");
        int second = scanner.nextInt();
        System.out.print("Type third number : ");
        int third = scanner.nextInt();
        System.out.println("Arithmetical mean is " + (first + second + third) / (double)3);

        // Task 11 + 15
    }
}
