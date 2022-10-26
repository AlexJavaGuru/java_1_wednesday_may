package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_4.level_3;

import java.util.Scanner;

class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("ALL numbers are equal");
        } else if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
            System.out.println("ALL numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Increasing order");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Largest number is: " + firstNumber);
        } else if (firstNumber < secondNumber && secondNumber > thirdNumber) {
            System.out.println("Largest number is: " + secondNumber);
        } else {
            System.out.println("Largest number is: " + thirdNumber);
        }
    }
}
