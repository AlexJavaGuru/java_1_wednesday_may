package main.java.lv.javaguru.student_rodions_pismennijs.lesson_4.level_1;

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative.");
        } else {
            System.out.println("Number is zero.");
        }
    }
}
