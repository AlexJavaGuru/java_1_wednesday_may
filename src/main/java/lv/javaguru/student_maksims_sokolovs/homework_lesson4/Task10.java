package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson4;

import java.util.Scanner;

class Task10 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        while (true) {

            System.out.println("Enter three numbers: ");

            int numberOne = scnr.nextInt();
            int numberTwo = scnr.nextInt();
            int numberThree = scnr.nextInt();

            if (numberOne > numberTwo && numberOne > numberThree) {
                System.out.println(numberOne + " is the largest number");
            } else if (numberTwo > numberOne && numberTwo > numberThree) {
                System.out.println(numberTwo + " is the largest number");
            } else {
                System.out.println(numberThree + " is the largest number");

            }
        }
    }
}