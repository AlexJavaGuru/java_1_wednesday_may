package lv.javaguru.student_alija_alijeva.lesson4.level_3.task_8;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Your numbers is ");
        int numberOne = numbers.nextInt();
        int numberTwo = numbers.nextInt();
        int numberThree = numbers.nextInt();
        if (numberOne == numberTwo && numberOne == numberThree) {
            System.out.println("All numbers are equal");
        } else if (numberOne != numberTwo && numberOne != numberThree) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
