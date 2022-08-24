package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_10;

import java.util.Scanner;

public class FiniteNumber {

    public static void main(String[] args) {

        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("The biggest number is: " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("The biggest number is: " + numberTwo);
        } else {
            System.out.println("The biggest number is: " + numberThree);
        }
    }
}