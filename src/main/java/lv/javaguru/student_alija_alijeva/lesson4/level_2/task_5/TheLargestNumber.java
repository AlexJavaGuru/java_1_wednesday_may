package lv.javaguru.student_alija_alijeva.lesson4.level_2.task_5;

import java.util.Scanner;

class TheLargestNumber {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Your numbers is ");
        int numberOne = numbers.nextInt();
        int numberTwo = numbers.nextInt();
        if (numberOne < numberTwo) {
            System.out.println("The largest number is " + numberTwo);
        } else {
            System.out.println("The largest number is " + numberOne);
        }
    }
}