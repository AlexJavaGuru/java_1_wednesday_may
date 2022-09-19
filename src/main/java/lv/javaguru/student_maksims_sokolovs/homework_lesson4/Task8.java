package lv.javaguru.student_maksims_sokolovs.homework_lesson4;

import java.util.Scanner;

class Task8 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        while (true) {

            System.out.println("Enter three numbers: ");

            int numberOne = scnr.nextInt();
            int numberTwo = scnr.nextInt();
            int numberThree = scnr.nextInt();

            if (numberOne == numberTwo && numberTwo == numberThree) {
                System.out.println("The numbers are equal ");
            } else if (numberOne != numberTwo && numberTwo != numberThree) {
                System.out.println("The numbers are not equal ");
            } else {
                System.out.println("Neither all are equal or different ");

            }
        }
    }
}