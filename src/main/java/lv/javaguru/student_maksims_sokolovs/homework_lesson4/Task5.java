package lv.javaguru.student_maksims_sokolovs.homework_lesson4;

import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        while (true) {

            System.out.println("Enter two numbers: ");

            int numberOne = scnr.nextInt();
            int numberTwo = scnr.nextInt();

            if (numberOne > numberTwo) {
                System.out.println(numberOne + " is the largest number.");
            } else {
                System.out.println(numberTwo + " is the largest number.");

            }
        }
    }
}