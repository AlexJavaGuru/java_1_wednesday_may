package main.java.lv.javaguru.student_rodions_pismennijs.homework.lesson_2.level_1;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.println("Type first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Type second number...");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber;

        System.out.println("Addition of numbers " + firstNumber + " and " + secondNumber + " is " + addition);
        System.out.println("Subtraction of numbers " + firstNumber + " and " + secondNumber + " is " + subtraction);
        System.out.println("Multiplication of numbers " + firstNumber + " and " + secondNumber + " is " + multiplication);
        System.out.println("Division of numbers " + firstNumber + " and " + secondNumber + " is " + division);

        // Task 2
        System.out.println("Type first number...");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Type second number...");
        double secondDoubleNumber = scanner.nextDouble();

        double additionDouble = firstDoubleNumber + secondDoubleNumber;
        double subtractionDouble = firstDoubleNumber - secondDoubleNumber;
        double multiplicationDouble = firstDoubleNumber * secondDoubleNumber;
        double divisionDouble = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Addition of numbers " + firstDoubleNumber + " and " + secondDoubleNumber + " is " + additionDouble);
        System.out.println("Subtraction of numbers " + firstDoubleNumber + " and " + secondDoubleNumber + " is " + subtractionDouble);
        System.out.println("Multiplication of numbers " + firstDoubleNumber + " and " + secondDoubleNumber + " is " + multiplicationDouble);
        System.out.println("Division of numbers " + firstDoubleNumber + " and " + secondDoubleNumber + " is " + divisionDouble);

    }
}
