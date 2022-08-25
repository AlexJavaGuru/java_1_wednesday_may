package lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_9;

import java.util.Scanner;

public class Increasing {

    public static void main(String[] args) {

        System.out.println("Enter three numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("increasing");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
