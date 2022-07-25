package main.java.lv.javaguru.student_alija_alijeva.lesson4.level_2.task_7;

import java.util.Scanner;

class EqualsOrDifferent {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Your numbers is ");
        int numberOne = numbers.nextInt();
        int numberTwo = numbers.nextInt();
        if (numberOne == numberTwo) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}

