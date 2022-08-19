package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_7;

import java.util.Scanner;

public class EqualNumber {

    public static void main(String[] args) {

        System.out.print("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
