package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_4.level_2;

import java.util.Scanner;

class NumbersComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Highest number is: " + firstNumber);
        } else {
            System.out.println("Highest number is: " + secondNumber);
        }

        if (firstNumber < secondNumber) {
            System.out.println("Lowest number is: " + firstNumber);
        } else {
            System.out.println("Lowest number is: " + secondNumber);
        }

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
