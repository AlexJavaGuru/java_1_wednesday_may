package lv.javaguru.student_maksims_sokolovs.homework_lesson4;

import java.util.Scanner;

class Task9 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        while (true) {

            System.out.println("Enter three numbers: ");

            int numberOne = scnr.nextInt();
            int numberTwo = scnr.nextInt();
            int numberThree = scnr.nextInt();

            if (numberOne < numberTwo && numberTwo < numberThree) {
                System.out.println("Increasing ");
            } else if (numberOne > numberTwo && numberTwo > numberThree) {
                System.out.println("Decreasing ");
            } else {
                System.out.println("Neither increasing or decreasing order ");

            }
        }
    }
}
