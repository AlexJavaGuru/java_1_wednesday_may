package lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_6;

import java.util.Scanner;

public class SmallNumber {

    public static void main(String[] args) {

        System.out.print("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        if (numberOne < numberTwo) {
            System.out.println("Smallest number is: " + numberOne);
        } else {
            System.out.println("Smallest number is: " + numberTwo);
        }
    }
}
