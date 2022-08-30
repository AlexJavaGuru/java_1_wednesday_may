package lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_8;

import java.util.Scanner;


public class ThreeNumbers {

    public static void main(String[] args) {

        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberTwo != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
