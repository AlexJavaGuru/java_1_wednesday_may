package main.java.lv.javaguru.student_alija_alijeva.lesson4.level_1.task_4;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        Scanner numberOne = new Scanner(System.in);
        System.out.println("Your number is ");
        int number = numberOne.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}