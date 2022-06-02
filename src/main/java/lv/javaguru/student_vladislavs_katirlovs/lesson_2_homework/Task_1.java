package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_2_homework;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type variable a...");
        int firstNumber = scanner.nextInt();
        System.out.println("Type variable b...");
        int secondNumber = scanner.nextInt();

        int add = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        double div = firstNumber / (double) secondNumber;
        System.out.println("Sum of numbers - " + add);
        System.out.println("Subtraction of numbers - " + sub);
        System.out.println("Multiplication of numbers - " + mult);
        System.out.println("Division of numbers - " + div);
    }
}
