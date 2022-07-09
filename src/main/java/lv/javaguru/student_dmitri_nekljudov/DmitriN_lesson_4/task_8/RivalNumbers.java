package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_8;

import java.util.Scanner;

class RivalNumbers {

    public static void main(String[] args) {

        System.out.print("write 3 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.println("All numbers are equal \"  if all three numbers are equal");
        } else if (numberOne != numberTwo && numberTwo != numberThree) {
            System.out.println("All numbers are different \"   if all three numbers are different");
        } else {
            System.out.println("Neither all are equal or different\" otherwise");
        }
    }
}