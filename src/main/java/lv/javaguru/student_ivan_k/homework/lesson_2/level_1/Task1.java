package main.java.lv.javaguru.student_ivan_k.homework.lesson_2.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter first number :");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        int div = firstNumber / secondNumber;


        System.out.println("Addition is : " + sum);
        System.out.println("Subtraction is : " + sub);
        System.out.println("Multiplication is : " + mult);
        System.out.println("Division is : " + div);
    }
}
