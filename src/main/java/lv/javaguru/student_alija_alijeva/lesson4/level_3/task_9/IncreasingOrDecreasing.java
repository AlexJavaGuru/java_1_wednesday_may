package main.java.lv.javaguru.student_alija_alijeva.lesson4.level_3.task_9;

import java.util.Scanner;

public class IncreasingOrDecreasing {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Your numbers is ");
        int numberOne = numbers.nextInt();
        int numberTwo = numbers.nextInt();
        int numberThree = numbers.nextInt();
        if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("increasing");
        } else if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
