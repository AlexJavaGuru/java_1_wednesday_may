package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_9;

import java.util.Scanner;

class AscendingDescending {

    public static void main(String[] args) {

        System.out.print("write 3 numbers: ");
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

